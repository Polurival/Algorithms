package easy

import org.junit.Test

import org.junit.Assert.*

class T242ValidAnagramTest {

    @Test
    fun isAnagram() {
        val testClass = T242ValidAnagram()
        assertEquals(true, testClass.isAnagram("anagram", "nagaram"))
        assertEquals(false, testClass.isAnagram("rat", "car"))
        assertEquals(false, testClass.isAnagram("a", "ab"))
    }
}