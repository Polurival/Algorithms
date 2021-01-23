package interviewtasks

import org.junit.Test

import org.junit.Assert.*

/**
 * @author Польщиков Юрий on 23/01/2021
 */
class RLECompressionTest {

    val compressor = RLECompression()

    @Test
    fun compress() {
        assertEquals("", compressor.compress(""))
        assertEquals("Z", compressor.compress("Z"))
        assertEquals("2H", compressor.compress("HH"))
        assertEquals("4A3B2C", compressor.compress("AAAABBBCC"))
        assertEquals("ABC4D3E", compressor.compress("ABCDDDDEEE"))
        assertEquals("A2FBCE", compressor.compress("AFFBCE"))
    }

    @Test(expected = IllegalArgumentException::class)
    fun compressNull() {
        compressor.compress(null)
    }

    @Test(expected = IllegalArgumentException::class)
    fun compressIllegalOneChar() {
        compressor.compress("4")
    }

    @Test(expected = IllegalArgumentException::class)
    fun compressIllegalChar() {
        compressor.compress("B4")
    }
}