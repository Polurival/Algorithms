package easy

/**
 * My solution
 *
 * Related Topics: Math
 *
 * Time complexity O(1)
 * Space complexity O(1)
 */
class T9PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        val xStr = x.toString()
        for (i in xStr.indices) {
            if (xStr[i] != xStr[xStr.length - i - 1]) {
                return false
            }
        }
        return true
    }
}

/**
 * Fast math solution
 *
 * Related Topics: Math
 *
 * Time complexity O(log10(n)) but imho for this task it is always 1, because n is maximum 10 (Integer.MAX length)
 * Space complexity O(1)
 */
class T9Solution {
    fun isPalindrome(x: Int): Boolean {
        var res = x
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false
        }
        var revertedX = 0
        while (res > revertedX) {
            revertedX = revertedX * 10 + res % 10
            res /= 10
        }
        return res == revertedX || res == revertedX / 10
    }
}