package array.easy

/**
 * Time complexity O(nums.size)
 * Space complexity O(1)
 */
class T35SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        if (target < nums[0]) return 0
        else if (target > nums[nums.size - 1]) return nums.size

        for (i in nums.indices) {
            if (target == nums[i] || (target < nums[i] && target > nums[i - 1])) return i
        }
        return -1
    }
}

/**
 * It's slow solution because of use copyOfRange.
 * One of the best solutions is O(ln(n)) has leftIndex and rightIndex and bias them
 *
 * Time complexity O(ln(nums.size))
 * Space complexity O(1)
 */
class T35SearchInsertPositionBinarySearch {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (target < nums[0]) return 0
        else if (target > nums[nums.size - 1]) return nums.size

        var chunk = nums
        var bias = 0
        var middle = chunk.size / 2
        while (middle > 0) {
            if ((target == chunk[middle]) || (target > chunk[middle - 1] && target < chunk[middle])) {
                return middle + bias

            } else if (target > chunk[middle]) {
                bias += middle
                chunk = chunk.copyOfRange(middle, chunk.size)

            } else {
                chunk = chunk.copyOfRange(0, middle)
            }
            middle = chunk.size / 2
        }

        return middle
    }
}

/**
 * best solution - copied from leetcode.
 * It has O(nums.size) but minimum variables and conditions
 *
 * Time complexity O(nums.size)
 * Space complexity O(1)
 */
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var size = nums.size
        for (i in 0 until size) {
            if (nums[i] >= target) {
                return i
            }
        }
        return size
    }
}