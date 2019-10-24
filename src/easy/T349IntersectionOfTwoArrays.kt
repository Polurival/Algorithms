package easy

/**
 * Related Topics: Hash Table, Two Pointers, Binary Search, Sort
 *
 * Time complexity O(nums1.size + nums2.size)
 * Space complexity O(nums1.size + result.size)
 */
class T349IntersectionOfTwoArrays {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = HashSet<Int>()

        val nums1Set = HashSet<Int>()
        for (num in nums1) {
            nums1Set.add(num)
        }
        for (num in nums2) {
            if (nums1Set.contains(num)) {
                result.add(num)
            }
        }
        return result.toIntArray()
    }
}