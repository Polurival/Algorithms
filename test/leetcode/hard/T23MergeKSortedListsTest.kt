package leetcode.hard

import org.junit.Test

/**
 * @author Польщиков Юрий on 15/01/2021
 */
class T23MergeKSortedListsTest {

    @Test
    fun mergeKLists() {
        //[[1,4,5],[1,3,4],[2,6]]
        val l11 = T23MergeKSortedLists.ListNode(1)
        val l12 = T23MergeKSortedLists.ListNode(4)
        val l13 = T23MergeKSortedLists.ListNode(5)
        l11.next = l12
        l12.next = l13

        val l21 = T23MergeKSortedLists.ListNode(1)
        val l22 = T23MergeKSortedLists.ListNode(3)
        val l23 = T23MergeKSortedLists.ListNode(4)
        l21.next = l22
        l22.next = l23

        val l31 = T23MergeKSortedLists.ListNode(2)
        val l32 = T23MergeKSortedLists.ListNode(6)
        l31.next = l32

        val result = T23MergeKSortedLists().mergeKLists(arrayOf(l11, l21, l31))
        print(result?.`val`)
        var current = result?.next
        while (current != null) {
            print(current.`val`)
            current = current.next
        }

    }
}