package interviewtasks

import org.junit.Test

import org.junit.Assert.*

/**
 * @author Польщиков Юрий on 23/01/2021
 */
class ShuffleArrayTest {

    @Test
    fun shuffle() {
        val arr = intArrayOf(1,2,3,4,5,6,7)
        arr.myShuffle()
        println(arr.toList())
    }
}