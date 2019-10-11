package string.easy

import org.junit.Test
import kotlin.test.assertEquals

class `13RomanToIntegerTest` {

    @Test
    fun romanToInteger() {
        assertEquals(1, `13RomanToInteger`().romanToInt("I"))
        assertEquals(27, `13RomanToInteger`().romanToInt("XXVII"))
        assertEquals(30, `13RomanToInteger`().romanToInt("XXX"))
        assertEquals(1909, `13RomanToInteger`().romanToInt("MCMIX"))
        assertEquals(2344, `13RomanToInteger`().romanToInt("MMCCCXLIV"))
        assertEquals(3999, `13RomanToInteger`().romanToInt("MMMCMXCIX"))
    }
}