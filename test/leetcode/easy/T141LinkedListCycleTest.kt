package leetcode.easy

import org.junit.Test

import org.junit.Assert.*

/**
 * @author Польщиков Юрий on 16/01/2021
 */
class T141LinkedListCycleTest {

    private val linkedListCycle = T141LinkedListCycle()

    @Test
    fun hasCycle() {
        val n1 = T141LinkedListCycle.ListNode(3)
        val n2 = T141LinkedListCycle.ListNode(2)
        val n3 = T141LinkedListCycle.ListNode(0)
        val n4 = T141LinkedListCycle.ListNode(-4)

        n1.next = n2
        n2.next = n3
        n3.next = n4
        n4.next = n2

        assertTrue(linkedListCycle.hasCycle(n1))
    }

    @Test
    fun hasNotCycle() {
        val n1 = T141LinkedListCycle.ListNode(3)
        val n2 = T141LinkedListCycle.ListNode(2)
        val n3 = T141LinkedListCycle.ListNode(0)
        val n4 = T141LinkedListCycle.ListNode(-4)

        n1.next = n2
        n2.next = n3
        n3.next = n4

        assertFalse(linkedListCycle.hasCycle(n1))
    }
}