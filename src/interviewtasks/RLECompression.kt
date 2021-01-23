package interviewtasks

/**
 * Алгоритм сжатия
 * Нужно реализовать такой алгоритм сжатия:
 * AAAABBBCC -> 4A3B2C
 * ABCDDDDEEE -> ABC4D3E
 *
 * @author Польщиков Юрий on 23/01/2021
 */
class RLECompression {

    fun compress(input: String?): String {
        if (input == null) {
            throw IllegalArgumentException()
        }
        if (input.length < 2) {
            if (input.length == 1 && input[0] !in 'A'..'Z') {
                throw IllegalArgumentException()
            }
            return input
        }
        var output = ""

        var prev: Char? = input[0]
        var count = 1
        for (i in 1 until input.length) {
            if (input[i] !in 'A'..'Z') {
                throw IllegalArgumentException()
            }
            if (input[i] == prev) {
                count++
                if (i == input.lastIndex) {
                    output += "" + count + prev
                }
            } else if (count == 1) {
                output += prev
                if (i == input.lastIndex) {
                    output += input[i]
                }
            } else {
                output += "" + count + prev
                count = 1
            }
            prev = input[i]
        }
        return output
    }
}