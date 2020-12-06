package leetcode.easy

/**
 * Related Topics: Array, Hash Table
 *
 * Time complexity O(words.length * word.length)
 * Space complexity O(1)
 */
class T1160FindWordsThatCanBeFormedByCharacters {

    fun countCharacters(words: Array<String>, chars: String): Int {
        var result = 0

        val charsMap = HashMap<Char, Int>()
        for (char in chars) {
            val charCount = charsMap[char]
            if (charCount == null) {
                charsMap[char] = 1
            } else {
                charsMap[char] = charCount + 1
            }
        }

        var tempCharsMap: HashMap<Char, Int>
        for (word in words) {
            tempCharsMap = HashMap(charsMap)
            for (i in word.indices) {
                val charCount = tempCharsMap[word[i]]
                if (charCount == null || charCount == 0) {
                    break
                } else {
                    tempCharsMap[word[i]] = charCount - 1
                }
                if (i == word.length - 1) {
                    result += word.length
                }
            }

        }

        return result
    }
}