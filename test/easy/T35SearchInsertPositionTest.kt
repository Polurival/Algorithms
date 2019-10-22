package easy

import easy.T35SearchInsertPosition
import easy.T35SearchInsertPositionBinarySearch
import org.junit.Test

import org.junit.Assert.*

class T35SearchInsertPositionTest {

    @Test
    fun searchInsert() {
        val testClass = T35SearchInsertPosition()
        assertEquals(2, testClass.searchInsert(intArrayOf(1,3,5,6), 5))
        assertEquals(0, testClass.searchInsert(intArrayOf(1,3,5,6), 1))
        assertEquals(1, testClass.searchInsert(intArrayOf(1,3,5,6), 2))
        assertEquals(4, testClass.searchInsert(intArrayOf(1,3,5,6), 7))
        assertEquals(0, testClass.searchInsert(intArrayOf(1,3,5,6), 0))

        val binarySearchTestClass = T35SearchInsertPositionBinarySearch()
        assertEquals(2, binarySearchTestClass.searchInsert(intArrayOf(1,3,5,6), 5))
        assertEquals(0, binarySearchTestClass.searchInsert(intArrayOf(1,3,5,6), 1))
        assertEquals(1, binarySearchTestClass.searchInsert(intArrayOf(1,3,5,6), 2))
        assertEquals(4, binarySearchTestClass.searchInsert(intArrayOf(1,3,5,6), 7))
        assertEquals(0, binarySearchTestClass.searchInsert(intArrayOf(1,3,5,6), 0))
        assertEquals(2, binarySearchTestClass.searchInsert(intArrayOf(1,3,5), 4))
        assertEquals(1, binarySearchTestClass.searchInsert(intArrayOf(1,3), 2))
    }
}