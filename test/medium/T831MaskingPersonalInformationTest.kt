package medium

import medium.T831MaskingPersonalInformation
import org.junit.Test

import org.junit.Assert.*

class T831MaskingPersonalInformationTest {

    @Test
    fun maskPII() {
        val testClass = T831MaskingPersonalInformation()
        assertEquals("l*****e@leetcode.com", testClass.maskPII("LeetCode@LeetCode.com"))
        assertEquals("a*****b@qq.com", testClass.maskPII("AB@qq.com"))

        assertEquals("***-***-7890", testClass.maskPII("1(234)567-890"))
        assertEquals("+**-***-***-5678", testClass.maskPII("86-(10)12345678"))
    }
}