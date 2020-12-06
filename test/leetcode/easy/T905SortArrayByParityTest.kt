package leetcode.easy

import org.junit.Assert.assertEquals
import org.junit.Test

class T905SortArrayByParityTest {

    @Test
    fun sortArrayByParity() {
        val testClass = T905SortArrayByParity()
        assertEquals(
            intArrayOf(4, 2, 3, 1).toList().toString(),
            testClass.sortArrayByParity(intArrayOf(3, 1, 2, 4)).toList().toString()
        )
    }
}