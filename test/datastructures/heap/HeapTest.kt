package datastructures.heap

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * @author Польщиков Юрий on 06/12/2020
 */
class HeapTest {

    private val heap = Heap()

    @Test
    fun buildMinHeap() {
        val heapArray = intArrayOf(31, 11, 7, 12, 15, 14, 9, 2, 3, 16)
        println("Before heapify: " + heapArray.contentToString())
        heap.buildMinHeap(heapArray, heapArray.size)

        println("After heapify: " + heapArray.contentToString())
        assertArrayEquals(intArrayOf(2, 3, 7, 11, 15, 14, 9, 12, 31, 16), heapArray)
    }

    @Test
    fun buildMaxHeap() {
        val heapArray = intArrayOf(1, 4, 7, 12, 15, 14, 9, 2, 3, 16)
        println("Before heapify: " + heapArray.contentToString())
        heap.buildMaxHeap(heapArray, heapArray.size)

        println("After heapify: " + heapArray.contentToString())
        assertArrayEquals(intArrayOf(16, 15, 14, 12, 4, 7, 9, 2, 3, 1), heapArray)
    }

    @Test
    fun findKSmallest() {
        val input = intArrayOf(9, 4, 7, 1, -2, 6, 5)
        val output = heap.findKSmallest(input, 2)

        println("K smallest elements: " + output.contentToString())
        assertArrayEquals(intArrayOf(-2, 1), output)
    }

    @Test
    fun findKLargest() {
        val input = intArrayOf(9, 4, 7, 1, -2, 6, 5)
        val output: IntArray = heap.findKLargest(input, 2)

        println("K largest elements: " + output.contentToString())
        assertArrayEquals(intArrayOf(9, 7), output)
    }
}