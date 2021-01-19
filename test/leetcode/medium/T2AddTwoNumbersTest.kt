package leetcode.medium

import org.junit.Test

import org.junit.Assert.*

/**
 * @author Польщиков Юрий on 19/01/2021
 */
class T2AddTwoNumbersTest {

    @Test
    fun addTwoNumbers() {
        //[2,4,3]
        //[5,6,4]
        val n11 = T2AddTwoNumbers.ListNode(2)
        val n12 = T2AddTwoNumbers.ListNode(4)
        val n13 = T2AddTwoNumbers.ListNode(3)
        n11.next = n12
        n12.next = n13

        val n21 = T2AddTwoNumbers.ListNode(5)
        val n22 = T2AddTwoNumbers.ListNode(6)
        val n23 = T2AddTwoNumbers.ListNode(4)
        n21.next = n22
        n22.next = n23

        val expected = T2AddTwoNumbers.ListNode(7)
        expected.next = T2AddTwoNumbers.ListNode(0)
        expected.next?.next = T2AddTwoNumbers.ListNode(8)
        val result = T2AddTwoNumbers().addTwoNumbers(n11, n21)

        assertEquals(expected, result)
    }
}