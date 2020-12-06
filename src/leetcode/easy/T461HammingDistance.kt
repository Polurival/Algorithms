package leetcode.easy

/**
 * Related Bit Manipulation
 *
 * https://en.wikipedia.org/wiki/Hamming_distance
 * Explanation:
 * 93 and 73
 * =
 * 1011101 and 1001001
 *
 * var result = 0
 * 1) 1011101
 *    ^
 *    1001001
 *    =
 *    0010100 (its 20)
 *
 * 2) temp > 0:
 *    0010100
 *    &
 *    0000001
 *    =
 *    0
 *
 * 3) temp = temp / 2 (its 10)
 *    temp > 0:
 *    1010
 *    &
 *    0001
 *    =
 *    0
 *
 * 4) temp = temp / 2 (its 5)
 *    temp > 0:
 *    101
 *    &
 *    001
 *    =
 *    1
 *
 *    result++
 *
 * 5) temp = temp / 2 (its 2)
 *    temp > 0:
 *    10
 *    &
 *    01
 *    =
 *    0
 *
 * 6) temp = temp / 2 (its 1)
 *    1
 *    &
 *    1
 *    =
 *    1
 *
 *    result ++
 *
 * 7) temp = temp / 2 (its 0)
 *    temp > 0 = false
 *
 *    return result
 *
 * Time complexity O(ln(x xor y))
 * Space complexity O(1)
 */
class T461HammingDistance {

    /**
     * solution from wikipedia
     */
    fun hammingDistance(x: Int, y: Int): Int {
        var dist = 0

        // Count the number of bits set
        var temp = x xor y
        while (temp > 0) {
            // If A bit is set, so increment the count
            if (temp and 1 == 1) {
                dist++
            }
            temp /= 2
            // Clear (delete) val's lowest-order bit
        }

        // Return the number of differing bits
        return dist
    }

    /**
     * fast solution out of the box
     */
    fun hammingDistanceFastSolution(x: Int, y: Int): Int {
        return Integer.bitCount(x.xor(y))
    }
}