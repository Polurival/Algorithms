package easy

import org.junit.Test

import org.junit.Assert.*

class T703KthLargestElementInAStreamTest {

    @Test
    fun add1() {
        val testClass = T703KthLargestElementInAStream(3, intArrayOf(4,5,8,2))
        assertEquals(4, testClass.add(3))
        assertEquals(5, testClass.add(5))
        assertEquals(5, testClass.add(10))
        assertEquals(8, testClass.add(9))
        assertEquals(8, testClass.add(8))
    }

    @Test
    fun add2() {
        //["KthLargest","add","add","add","add","add"]
        //[[1,[]],[-3],[-2],[-4],[0],[4]]
        val testClass = T703KthLargestElementInAStream(3, intArrayOf())
        assertEquals(-3, testClass.add(-3))
        assertEquals(-2, testClass.add(-2))
        assertEquals(-2, testClass.add(-4))
        assertEquals(0, testClass.add(0))
        assertEquals(4, testClass.add(4))
    }
    
    @Test
    fun add3() {
        //["KthLargest","add","add","add","add","add"]
        //[[2,[0]],[-1],[1],[-2],[-4],[3]]
        val testClass = T703KthLargestElementInAStream(2, intArrayOf(0))
        assertEquals(-1,testClass.add(-1))
        assertEquals(0,testClass.add(1))
        assertEquals(0,testClass.add(-2))
        assertEquals(0,testClass.add(-4))
        assertEquals(1,testClass.add(3))
    }

    @Test
    fun add4() {
        //["KthLargest","add","add","add","add","add"]
        //[[3,[5,-1]],[2],[1],[-1],[3],[4]]
        val testClass = T703KthLargestElementInAStream(3, intArrayOf(5, -1))
        assertEquals(-1, testClass.add(2))
        assertEquals(1, testClass.add(1))
        assertEquals(1, testClass.add(-1))
        assertEquals(2, testClass.add(3))
        assertEquals(3, testClass.add(4))
    }
}