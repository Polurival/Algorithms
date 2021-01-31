package greedy

import java.util.ArrayDeque
import java.util.ArrayList
import java.util.PriorityQueue

/**
 * Решение задачи перевода набора символов с их частотами в строке в оптимальные безпрефиксные коды
 *
 * @author Польщиков Юрий on 01/12/2020
 */
class HuffmanCodes {

    private val treeQueue =
        PriorityQueue(Comparator<Tree> { p0, p1 -> compareValues(p0?.root?.priority, p1?.root?.priority) })

    fun makePrefixTree(symbolMap: Map<Char, Double>) {
        treeQueue.clear()

        for ((key, value) in symbolMap) {
            treeQueue.add(Tree(Node(key, value)))
        }

        while (treeQueue.size > 1) {
            val firstLowPriorityTree = treeQueue.remove()
            val secondLowPriorityTree = treeQueue.remove()

            val newNodePriority = firstLowPriorityTree.root.priority + secondLowPriorityTree.root.priority
            val newNode = Node(null, newNodePriority, secondLowPriorityTree.root, firstLowPriorityTree.root)
            val newTree = Tree(newNode)


            treeQueue.add(newTree)
        }
    }

    fun getBinaryCodeFor(symbol: Char): String {
        val result = ArrayList<Byte>()
        val visited = mutableSetOf<Node>()

        val rootNode = treeQueue.peek().root
        val stack = ArrayDeque<Node>()
        stack.add(rootNode)
        visited.add(rootNode)

        while (true) {
            val node = stack.last()
            if (node.symbol == symbol) {
                return result.joinToString(separator = "")
            }

            if (node.left != null && !visited.contains(node.left)) {
                stack.add(node.left)
                visited.add(node.left)
                result.add(0)
                continue
            } else if (node.right == null) {
                stack.removeLast()
                result.removeAt(result.lastIndex)
                continue
            }
            if (!visited.contains(node.right)) {
                stack.add(node.right)
                visited.add(node.right)
                result.add(1)
            } else {
                stack.removeLast()
                result.removeAt(result.lastIndex)
            }
        }
    }
}

data class Tree(val root: Node)

data class Node(val symbol: Char?, val priority: Double,
              val left: Node? = null, val right: Node? = null)