package leetcode.hard

/**
 * Time complexity O(n * ln(n))
 * Space complexity O(n)
 *
 * @author Польщиков Юрий on 15/01/2021
 */
class T23MergeKSortedLists {

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val temp = mutableListOf<Int>()
        for (listNode in lists) {
            var current = listNode
            while (current?.`val` != null) {
                temp.add(current.`val`)
                current = current.next
            }
        }

        temp.sort()

        var current: ListNode? = null
        var result: ListNode? = null
        for (num in temp) {
            if (current == null) {
                result = ListNode(num)
                current = result
            } else {
                current.next = ListNode(num)
                current = current.next
            }
        }
        return result
    }

    data class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

