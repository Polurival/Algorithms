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
        val output = StringBuilder()

        var prev = input[0]
        var count = 1
        for (i in 1 until input.length) {
            if (input[i] !in 'A'..'Z') {
                throw IllegalArgumentException()
            }
            if (input[i] == prev) {
                count++
            } else if (count == 1) {
                output.append(prev)
                prev = input[i]
            } else {
                output.append(count).append(prev)
                prev = input[i]
                count = 1
            }
        }
        if (count > 1) {
            output.append(count).append(prev)
        } else {
            output.append(prev)
        }
        return output.toString()
    }
}