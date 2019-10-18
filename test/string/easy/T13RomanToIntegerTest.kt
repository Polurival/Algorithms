package string.easy

import org.junit.Test
import kotlin.test.assertEquals

class T13RomanToIntegerTest {

    @Test
    fun romanToInteger() {
        assertEquals(1, T13RomanToInteger().romanToInt("I"))
        assertEquals(27, T13RomanToInteger().romanToInt("XXVII"))
        assertEquals(30, T13RomanToInteger().romanToInt("XXX"))
        assertEquals(1909, T13RomanToInteger().romanToInt("MCMIX"))
        assertEquals(2344, T13RomanToInteger().romanToInt("MMCCCXLIV"))
        assertEquals(3999, T13RomanToInteger().romanToInt("MMMCMXCIX"))
    }
}