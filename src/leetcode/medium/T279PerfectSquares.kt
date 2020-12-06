package leetcode.medium

import java.util.*
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt


/**
 * Related Topics: Math, Dynamic Programming, Breadth-first Search
 *
 * Wrong my solution. It can't pass such numbers as 97, 98 and bigger numbers
 *
 * Time complexity O(1)
 * Space complexity O(1)
 */
class T279PerfectSquares {

    fun numSquares(n: Int): Int {
        var resultSum = 0.0
        var result = 0

        while (resultSum != n.toDouble()) {
            val remain1 = n - resultSum
            val n2 = floor(sqrt(remain1)).pow(2.0)
            resultSum += n2
            result += 1
        }

        if (result > 1) {
            for (i in 2 until result) {
                var k = n * 1.0 / i
                if (k % 1 == 0.0 && sqrt(k) % 1 == 0.0) {
                    result = if (result < i) result else i
                }
                k = (n * 1.0 - 1) / i
                if (k % 1 == 0.0 && sqrt(k) % 1 == 0.0) {
                    result = if (result < i + 1) result else i + 1
                }
            }
        }

        return result
    }
}

/**
 * How to understand that such type of task solved by this way?
 *
 * Time complexity O(n)
 * Space complexity O(1)
 */
class T279PerfectSquaresShortSolution {

    fun numSquares(n: Int): Int {
        val record = IntArray(n + 1)
        for (i in 0..n) {
            record[i] = i
            var j = 1
            while (j * j <= i) {
                record[i] = Math.min(record[i - j * j] + 1, record[i])
                j++
            }
        }
        return record[n]
    }
}

class T279PerfectSquaresBFSSolution {

    fun numSquares(n: Int): Int {
        //Step 1. Build up HashSet to store the squares number
        val seen = HashSet<Int>()

        //Step 2. Initialize depth
        var depth = 0

        //Step 3. Build up Queue to store the sequence of (input - squares)
        val queue = LinkedList<Int>()
        queue.offer(n)

        //Step 4. Begin BFS
        while (!queue.isEmpty()) {
            val size = queue.size
            depth++
            for (i in 0 until size) {
                val node = queue.poll()
                if (!seen.add(node)) continue
                var j = 1
                while (j <= Math.sqrt(node.toDouble())) {
                    val les = node - j * j
                    if (les == 0) {
                        return depth
                    }
                    queue.offer(les)
                    j++
                }
            }
        }

        return 0
    }
}