package leetcode.easy

import org.junit.Test
import kotlin.test.assertEquals

class T1160FindWordsThatCanBeFormedByCharactersTest {

    @Test
    fun countCharacters() {
        val testClass = T1160FindWordsThatCanBeFormedByCharacters()
        assertEquals(6, testClass.countCharacters(arrayOf("cat","bt","hat","tree"), "atach"))
        assertEquals(10, testClass.countCharacters(arrayOf("hello","world","leetcode"), "welldonehoneyr"))
    }
}