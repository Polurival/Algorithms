package string.medium

import org.junit.Test

import org.junit.Assert.*

class T831MaskingPersonalInformationTest {

    @Test
    fun maskPII() {
        assertEquals("l*****e@leetcode.com", T831MaskingPersonalInformation().maskPII("LeetCode@LeetCode.com"))
        assertEquals("a*****b@qq.com", T831MaskingPersonalInformation().maskPII("AB@qq.com"))

        assertEquals("***-***-7890", T831MaskingPersonalInformation().maskPII("1(234)567-890"))
        assertEquals("+**-***-***-5678", T831MaskingPersonalInformation().maskPII("86-(10)12345678"))
    }
}