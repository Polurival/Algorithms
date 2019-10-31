package easy

/**
 * Related Topics: Hash Table, Sort
 *
 * Time complexity O(s.length + t.length)
 * Space complexity O(1)
 */
class T242ValidAnagram {

    /**
     * My solution
     */
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val sMap = HashMap<Char, Int>(s.length)
        for (c in s) {
            val count = sMap[c]
            if (count == null || count == 0) {
                sMap[c] = 1
            } else {
                sMap[c] = count + 1
            }
        }
        for (c in t) {
            val count = sMap[c]
            if (count != null) {
                if (count > 1) {
                    sMap[c] = count - 1
                } else {
                    sMap.remove(c)
                }
            } else {
                break
            }
        }
        return sMap.isEmpty()
    }

    /**
     * Fast but for Unicode strings not so good solution
     *
     * Time complexity O(s.length + t.length)
     * Space complexity O(1)
     */
    fun isAnagramFasterSolution(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val table = IntArray(26)
        for (i in 0 until s.length) {
            table[s[i] - 'a']++
        }
        for (i in 0 until t.length) {
            table[t[i] - 'a']--
            if (table[t[i] - 'a'] < 0) {
                return false
            }
        }
        return true
    }
}