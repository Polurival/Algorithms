package medium

import org.junit.Test

import org.junit.Assert.*

class T79WordSearchTest {

    @Test
    fun exist() {
        val testClass = T79WordSearch()

        assertEquals(true, testClass.exist(arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
        ), "ABCCED"))

        assertEquals(true, testClass.exist(arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
        ), "SEE"))

        assertEquals(false, testClass.exist(arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
        ), "ABCB"))
    }
}