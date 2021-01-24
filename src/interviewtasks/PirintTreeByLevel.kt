package interviewtasks

/**
 * Time complexity O(count of nodes)
 * Space complexity O(count of nodes)
 *
 * @author Польщиков Юрий on 24/01/2021
 */
fun printTreeByLevel(head: Node) {
    var level = ArrayDeque<Node>()
    level.add(head)
    while (level.isNotEmpty()) {
        val tempQueue = ArrayDeque<Node>()
        for (node in level) {
            print("${node.value} ")
            node.left?.let {
                tempQueue.add(it)
            }
            node.right?.let {
                tempQueue.add(it)
            }
        }
        println()
        level = tempQueue
    }
}

data class Node(
    val value: Int,
    val left: Node? = null,
    val right: Node? = null
)