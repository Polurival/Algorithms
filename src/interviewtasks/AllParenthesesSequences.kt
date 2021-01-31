package interviewtasks

/**
 * Вывести все правильные скобочные последовательности для n скобок:
 *
 * @author Польщиков Юрий on 31/01/2021
 */
class AllParenthesesSequences {

    fun solution(n: Int) {
        generate("", 0, 0, n)
    }

    private fun generate(cur: String, open: Int, close: Int, n: Int) {
        if (cur.length == n * 2) {
            println(cur)
            return
        }
        if (open < n) {
            generate("$cur(", open + 1, close, n)
        }
        if (close < open) {
            generate("$cur)", open, close + 1, n)
        }
    }
}