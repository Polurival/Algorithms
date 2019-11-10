package easy

import org.junit.Test

import org.junit.Assert.*

class T461HammingDistanceTest {

    @Test
    fun hammingDistance() {
        val testClass = T461HammingDistance()
        assertEquals(2, testClass.hammingDistance(1, 4)) // 001 and 100
        assertEquals(2, testClass.hammingDistance(93, 73)) // 1011101 and 1001001
        assertEquals(31, testClass.hammingDistance(2147483647, 0))
    }
}
