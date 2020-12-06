package greedy

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author Польщиков Юрий on 01/12/2020
 */
class HuffmanCodesTest {

    private val huffmanCodes = HuffmanCodes()

    @Test
    fun huffmanCodesTest1() {
        huffmanCodes.makePrefixTree(mapOf(
            'A' to 0.6,
            'B' to 0.25,
            'C' to 0.1,
            'D' to 0.05
        ))
        assertEquals("0", huffmanCodes.getBinaryCodeFor('A'))
        assertEquals("10", huffmanCodes.getBinaryCodeFor('B'))
        assertEquals("110", huffmanCodes.getBinaryCodeFor('C'))
        assertEquals("111", huffmanCodes.getBinaryCodeFor('D'))
    }

    @Test
    fun huffmanCodesTest2() {
        huffmanCodes.makePrefixTree(mapOf(
            'A' to 0.32,
            'B' to 0.25,
            'C' to 0.2,
            'D' to 0.18,
            'E' to 0.05
        ))
        assertEquals("00", huffmanCodes.getBinaryCodeFor('A'))
        assertEquals("01", huffmanCodes.getBinaryCodeFor('B'))
        assertEquals("11", huffmanCodes.getBinaryCodeFor('C'))
        assertEquals("100", huffmanCodes.getBinaryCodeFor('D'))
        assertEquals("101", huffmanCodes.getBinaryCodeFor('E'))
    }

    @Test
    fun huffmanCodesTest3() {
        huffmanCodes.makePrefixTree(mapOf(
            'A' to 0.16,
            'B' to 0.08,
            'C' to 0.35,
            'D' to 0.07,
            'E' to 0.34
        ))
        assertEquals("010", huffmanCodes.getBinaryCodeFor('A'))
        assertEquals("0110", huffmanCodes.getBinaryCodeFor('B'))
        assertEquals("1", huffmanCodes.getBinaryCodeFor('C'))
        assertEquals("0111", huffmanCodes.getBinaryCodeFor('D'))
        assertEquals("00", huffmanCodes.getBinaryCodeFor('E'))
    }
}