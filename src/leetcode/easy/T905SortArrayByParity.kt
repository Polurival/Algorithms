package leetcode.easy

/**
 * Related Topics: Array
 *
 * Time complexity O(A.size)
 * Space complexity O(1)
 */
class T905SortArrayByParity {

    fun sortArrayByParity(A: IntArray): IntArray {
        val result = ArrayList<Int>(A.size)
        for (n in A) {
            if (n % 2 == 0) {
                result.add(0, n)
            } else {
                result.add(n)
            }
        }
        return result.toIntArray()
    }
}