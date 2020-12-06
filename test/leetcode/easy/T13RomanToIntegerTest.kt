package leetcode.easy

import org.junit.Test
import kotlin.test.assertEquals

class T13RomanToIntegerTest {

    @Test
    fun romanToInteger() {
        val testClass = T13RomanToInteger()
        assertEquals(1, testClass.romanToInt("I"))
        assertEquals(27, testClass.romanToInt("XXVII"))
        assertEquals(30, testClass.romanToInt("XXX"))
        assertEquals(1909, testClass.romanToInt("MCMIX"))
        assertEquals(2344, testClass.romanToInt("MMCCCXLIV"))
        assertEquals(3999, testClass.romanToInt("MMMCMXCIX"))
    }
}