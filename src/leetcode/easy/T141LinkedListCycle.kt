package leetcode.easy

/**
 * Time complexity O(n)
 * Space complexity O(1)
 *
 * @author Польщиков Юрий on 16/01/2021
 */
class T141LinkedListCycle {

    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }
        var slow = head
        var fast = head.next
        while (slow != fast) {
            if (fast?.next == null) {
                return false
            }
            slow = slow?.next
            fast = fast.next?.next
        }
        return true
    }

    data class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}