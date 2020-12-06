package leetcode.easy

import org.junit.Assert.assertTrue
import org.junit.Test

class T349IntersectionOfTwoArraysTest {

    @Test
    fun intersection() {
        val testClass = T349IntersectionOfTwoArrays()
        assertTrue(intArrayOf(2) contentEquals testClass.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
        assertTrue(
            intArrayOf(9, 4).toList() sameContentWith testClass.intersection(
                intArrayOf(4, 9, 5),
                intArrayOf(9, 4, 9, 8, 4)
            ).toList()
        )
    }

    private infix fun <T> Collection<T>.sameContentWith(collection: Collection<T>?)
            = collection?.let { this.size == it.size && this.containsAll(it) }!!
}