package leetcode.medium

/**
 * Time complexity O(max(m,n))
 * Space complexity O(max(m,n))
 *
 * @author Польщиков Юрий on 18/01/2021
 */
class T2AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null || l2 == null) {
            return null
        }
        var result: ListNode? = null
        var firstElement: ListNode? = null

        var num1Node = l1
        var num2Node = l2
        var lessThanTen = 0
        var moreThanTen = 0
        while (num1Node != null || num2Node != null) {
            val num1 = num1Node?.`val` ?: 0
            val num2 = num2Node?.`val` ?: 0
            var sum = num1 + num2
            if (moreThanTen > 0) {
                sum += moreThanTen
            }
            if (sum >= 10) {
                moreThanTen = sum / 10
                lessThanTen = sum % 10
            } else {
                moreThanTen = 0
                lessThanTen = sum
            }

            num1Node = num1Node?.next
            num2Node = num2Node?.next

            val temp = ListNode(lessThanTen)
            if (result == null) {
                result = temp
                firstElement = temp
            } else {
                result.next = temp
                result = result.next
            }
        }
        if (moreThanTen > 0) {
            result?.next = ListNode(moreThanTen)
        }
        return firstElement
    }

    data class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}