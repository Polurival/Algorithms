package string.easy

import org.junit.Test
import kotlin.test.assertEquals

class T38CountAndSayTest {

    @Test
    fun countAndSay() {
        val recursionTestClass = T38CountAndSayRecursion()
        assertEquals("1", recursionTestClass.countAndSay(1))
        assertEquals("11", recursionTestClass.countAndSay(2))
        assertEquals("21", recursionTestClass.countAndSay(3))
        assertEquals("1211", recursionTestClass.countAndSay(4))
        assertEquals("111221", recursionTestClass.countAndSay(5))
        assertEquals("13211311123113112211", recursionTestClass.countAndSay(10))

        val whileTestClass = T38CountAndSayTwoWhile()
        assertEquals("1", whileTestClass.countAndSay(1))
        assertEquals("11", whileTestClass.countAndSay(2))
        assertEquals("21", whileTestClass.countAndSay(3))
        assertEquals("1211", whileTestClass.countAndSay(4))
        assertEquals("111221", whileTestClass.countAndSay(5))
        assertEquals("13211311123113112211", whileTestClass.countAndSay(10))
    }
}