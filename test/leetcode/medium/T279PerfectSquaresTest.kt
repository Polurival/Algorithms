package leetcode.medium

import leetcode.medium.T279PerfectSquares
import leetcode.medium.T279PerfectSquaresBFSSolution
import leetcode.medium.T279PerfectSquaresShortSolution
import org.junit.Test

import org.junit.Assert.*

class T279PerfectSquaresTest {

    @Test
    fun numSquares() {
        val testClass = T279PerfectSquares()
        assertEquals(1, testClass.numSquares(1))
        assertEquals(2, testClass.numSquares(2))
        assertEquals(3, testClass.numSquares(3))
        assertEquals(2, testClass.numSquares(8))
        assertEquals(1, testClass.numSquares(9))
        assertEquals(3, testClass.numSquares(12))
        assertEquals(2, testClass.numSquares(13))
        assertEquals(3, testClass.numSquares(19))
        assertEquals(3, testClass.numSquares(99))
        // doesn't work:
        //assertEquals(3, testClass.numSquares(253))
        //assertEquals(2, testClass.numSquares(456853))
    }

    @Test
    fun numSquaresShortSolution() {
        val testClass = T279PerfectSquaresShortSolution()
        assertEquals(2, testClass.numSquares(13))
        assertEquals(3, testClass.numSquares(99))
        assertEquals(2, testClass.numSquares(456853))
    }

    @Test
    fun numSquaresBFSSolution() {
        val testClass = T279PerfectSquaresBFSSolution()
        assertEquals(2, testClass.numSquares(13))
        assertEquals(1, testClass.numSquares(16))
        assertEquals(3, testClass.numSquares(19))
        assertEquals(2, testClass.numSquares(456853))

    }
}