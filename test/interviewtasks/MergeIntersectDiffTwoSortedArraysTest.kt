package interviewtasks

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author Польщиков Юрий on 23/01/2021
 */
class MergeIntersectDiffTwoSortedArraysTest {

    val tested = MergeIntersectDiffTwoSortedArrays()

    @Test
    fun combineMerge() {
        //1, 2, 3, 5, 9 + 1, 3, 4, 6, 10 = 1, 1, 2, 3, 3, 5, 6, 9, 10
        val arr1 = intArrayOf(1, 2, 3, 5, 9)
        val arr2 = intArrayOf(1, 3, 4, 6, 10)

        assertEquals(
            intArrayOf(1, 1, 2, 3, 3, 4, 5, 6, 9, 10).toList(),
            tested.combine("+", arr1, arr2)?.toList()
        )
    }

    @Test
    fun combineIntersect() {
        //1, 2, 3, 5, 9 ^ 1, 3, 4, 6, 10 = 1, 1, 3, 3
        val arr1 = intArrayOf(1, 2, 3, 5, 9)
        val arr2 = intArrayOf(1, 3, 4, 6, 10)

        assertEquals(
            intArrayOf(1, 1, 3, 3).toList(),
            tested.combine("^", arr1, arr2)?.toList()
        )
    }

    @Test
    fun combineDiff() {
        //1, 2, 3, 5, 9 - 1, 3, 4, 6, 10 = 2, 4, 5, 6, 9, 10
        val arr1 = intArrayOf(1, 2, 3, 5, 9)
        val arr2 = intArrayOf(1, 3, 4, 6, 10)

        assertEquals(
            intArrayOf(2, 4, 5, 6, 9, 10).toList(),
            tested.combine("-", arr1, arr2)?.toList()
        )
    }
}