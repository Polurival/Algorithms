package leetcode.easy

/**
 * Related Topics: String
 *
 * Time complexity O(n * countAndSay(n, "1").length)
 * Space complexity O(n)
 */
class T38CountAndSayRecursion {

    fun countAndSay(n: Int): String {
        return countAndSay(n, "1")
    }

    private fun countAndSay(n: Int, str: String): String {
        if (n <= 1) {
            return str
        }

        val pairs = ArrayList<Pair<Int, Int>>()
        var prev: Char? = null
        for (c in str) {
            if (c == prev) {
                pairs[pairs.lastIndex] = Pair(pairs[pairs.lastIndex].first + 1, pairs[pairs.lastIndex].second)
            } else {
                pairs.add(Pair(1, Character.getNumericValue(c)))
            }
            prev = c
        }

        return countAndSay(n - 1, listToString(pairs))
    }

    private fun listToString(pairs: List<Pair<Int, Int>>): String {
        var result = ""
        for (pair in pairs) {
            result = result.plus(pair.first).plus(pair.second)
        }
        return result
    }
}

/**
 * Time complexity O(n * result(n-th).length)
 * Space complexity O(1)
 */
class T38CountAndSayTwoWhile {

    fun countAndSay(n: Int): String {
        var result = "1"
        if (n <= 1) {
            return result
        }

        val buf = StringBuilder()
        for (i in 1 until n) {
            buf.clear()
            var prevChar = result[0]
            var count = 1

            for (j in 1 until result.length) {
                if (result[j] == prevChar) {
                    count++
                } else {
                    buf.append(count).append(prevChar)
                    prevChar = result[j]
                    count = 1;
                }
            }
            result = buf.append(count).append(prevChar).toString()
        }

        return result
    }
}