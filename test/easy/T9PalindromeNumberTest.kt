package easy

import org.junit.Test

import org.junit.Assert.*

class T9PalindromeNumberTest {

    @Test
    fun isPalindrome() {
        val testClass = T9PalindromeNumber()
        assertTrue(testClass.isPalindrome(121))
        assertFalse(testClass.isPalindrome(-121))
        assertFalse(testClass.isPalindrome(10))
    }
}