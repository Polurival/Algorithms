package string.easy

/**
 * Time complexity O(s.length)
 * Space complexity O(1)
 */
class T13RomanToInteger {

    fun romanToInt(s: String): Int {
        var result = 0

        var i = 0
        while (i < s.length) {
            val c = s[i]
            val cNext = if (i + 1 < s.length) s[i + 1] else null

            if (c == 'I' && cNext == 'V') {
                result += 4
                i++
            } else if (c == 'I' && cNext == 'X') {
                result += 9
                i++
            } else if (c == 'X' && cNext == 'L') {
                result += 40
                i++
            } else if (c == 'X' && cNext == 'C') {
                result += 90
                i++
            } else if (c == 'C' && cNext == 'D') {
                result += 400
                i++
            } else if (c == 'C' && cNext == 'M') {
                result += 900
                i++
            } else if (c == 'I') {
                result += 1
            } else if (c == 'V') {
                result += 5
            } else if (c == 'X') {
                result += 10
            } else if (c == 'L') {
                result += 50
            } else if (c == 'C') {
                result += 100
            } else if (c == 'D') {
                result += 500
            } else if (c == 'M') {
                result += 1000
            }
            i++
        }

        return result
    }
}