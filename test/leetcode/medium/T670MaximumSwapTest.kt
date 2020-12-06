package leetcode.medium

import leetcode.medium.T670MaximumSwap
import org.junit.Test

import org.junit.Assert.*

class T670MaximumSwapTest {

    @Test
    fun maximumSwap() {
        val testClass = T670MaximumSwap()
        /*assertEquals(7236, testClass.maximumSwap(2736))
        assertEquals(9973, testClass.maximumSwap(9973))
        assertEquals(823176, testClass.maximumSwap(123876))
        assertEquals(99999991, testClass.maximumSwap(99919999))
        assertEquals(98863, testClass.maximumSwap(98368))
        assertEquals(511, testClass.maximumSwap(115))
        assertEquals(99131105, testClass.maximumSwap(19931105))
        assertEquals(90909011, testClass.maximumSwap(10909091))*/

        /*assertEquals(90909011, testClass.maximumSwapFast(10909091))
        assertEquals(511, testClass.maximumSwapFast(115))
        assertEquals(98863, testClass.maximumSwapFast(98368))*/

        assertEquals(99999991, testClass.maximumSwapFastSecond(99919999))
    }
}