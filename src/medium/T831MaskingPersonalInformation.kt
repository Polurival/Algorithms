package medium

/**
 * Related Topics: String
 *
 * Time complexity O(S.length)
 * Space complexity O(1)
 */
class T831MaskingPersonalInformation {

    fun maskPII(S: String): String {
        return if (S.contains('@', true)) maskEmails(S) else maskPhoneNumber(S)
    }

    private fun maskEmails(s: String): String {
        val emailParts = s.toLowerCase().split('@')
        val name1 = emailParts[0]
        return name1.first() + "*****" + name1.last() + '@' + emailParts[1]
    }

    private fun maskPhoneNumber(s: String): String {
        var countryCode = ""
        var lastNumbers = ""

        var count = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i].isDigit()) {
                count += 1
                if (count < 5) {
                    lastNumbers = s[i] + lastNumbers
                }
                if (count > 10) {
                    countryCode += '*'
                }
            }
        }
        if (countryCode.isNotEmpty()) {
            countryCode = "+$countryCode-"
        }
        return "$countryCode***-***-$lastNumbers"
    }
}