package string.easy

import org.junit.Test
import kotlin.test.assertEquals

class T38CountAndSayTest {

    @Test
    fun countAndSay() {
        assertEquals("1", T38CountAndSayRecursion().countAndSay(1))
        assertEquals("11", T38CountAndSayRecursion().countAndSay(2))
        assertEquals("21", T38CountAndSayRecursion().countAndSay(3))
        assertEquals("1211", T38CountAndSayRecursion().countAndSay(4))
        assertEquals("111221", T38CountAndSayRecursion().countAndSay(5))
        assertEquals("13211311123113112211", T38CountAndSayRecursion().countAndSay(10))

        assertEquals("1", T38CountAndSayTwoWhile().countAndSay(1))
        assertEquals("11", T38CountAndSayTwoWhile().countAndSay(2))
        assertEquals("21", T38CountAndSayTwoWhile().countAndSay(3))
        assertEquals("1211", T38CountAndSayTwoWhile().countAndSay(4))
        assertEquals("111221", T38CountAndSayTwoWhile().countAndSay(5))
        assertEquals("13211311123113112211", T38CountAndSayTwoWhile().countAndSay(10))
    }
}