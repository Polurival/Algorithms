package leetcode.easy

import java.util.*

/**
 * Related Topics: Heap
 *
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 *
 * My slow solution with constant memory
 *
 * Time complexity O(k * count(add())
 * Space complexity O(k)
 */
class T703KthLargestElementInAStream(k: Int, nums: IntArray) {

    private var k = 0
    private var kElement = Int.MIN_VALUE
    private val sortedNums: LinkedList<Int> = LinkedList()

    init {
        this.k = k
        if (nums.isNotEmpty()) {
            nums.sortDescending()
            val lastIndex = if (nums.size == k - 1) k - 1 else k
            sortedNums.addAll(nums.copyOfRange(0, lastIndex).asIterable())
            if (nums.size == k - 1) {
                kElement = sortedNums.last
            }
        }
    }

    fun add(`val`: Int): Int {
        if (`val` <= kElement) {
            if (sortedNums.size == k - 1) {
                sortedNums.add(`val`)
                kElement = sortedNums.last
            }
            return kElement
        }

        if (sortedNums.isEmpty()) {
            sortedNums.add(`val`)
        } else if (sortedNums.size == k - 1) {
            var index = 0
            for (num in sortedNums) {
                if (`val` >= num) {
                    sortedNums.add(index, `val`)
                    break
                }
                index++
            }
        } else {
            var index = 0
            for (num in sortedNums) {
                if (`val` >= num) {
                    sortedNums.add(index, `val`)
                    sortedNums.removeLast()
                    break
                }
                index++
            }
        }

        kElement = sortedNums.last
        return kElement
    }
}

/**
 * Fast solution
 *
 * Best solution
 *
 * Time complexity O(log(nums.size) * count(add())
 * Space complexity O(k)
 */
class KthLargest(k: Int, nums: IntArray) {

    val q = PriorityQueue<Int>()
    val size = k
    init{
        for(i in nums){
            add(i)
        }
    }

    fun add(`val`: Int): Int {
        q.offer(`val`)
        if(q.size > size){
            q.poll()
        }
        return q.peek()
    }
}