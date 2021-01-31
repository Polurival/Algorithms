package interviewtasks

import org.junit.Test

/**
 * @author Польщиков Юрий on 31/01/2021
 */
class AllParenthesesSequencesTest {

    private val tested = AllParenthesesSequences()

    /**
     * expected:
     * ((()))
     * (()())
     * (())()
     * ()(())
     * ()()()
     */
    @Test
    fun solution() {
        tested.solution(3)
    }
}