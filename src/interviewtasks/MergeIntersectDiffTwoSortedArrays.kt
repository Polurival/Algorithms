package interviewtasks

/**
 * Merge/Intersect/Diff двух сортированных массивов
 * Даны два массива, одинаково отсортированных (например оба по возрастанию)
 * Нужно написать функцию, которая бы объединяла их в один массив (1-й вариант)
 * или оставляла бы в массиве только общие элементы (2-й вариант)
 * или же только разные элементы (3-й вариант)
 *
 * @author Польщиков Юрий on 23/01/2021
 */
class MergeIntersectDiffTwoSortedArrays {

    fun combine(operation: String, arr1: IntArray, arr2: IntArray): IntArray? {
        return when (operation) {
            "+" -> merge(arr1, arr2)
            "^" -> intersect(arr1, arr2)
            "-" -> diff(arr1, arr2)
            else -> null
        }
    }

    /**
     * Time complexity O(arr1.size + arr2.size)
     * Space complexity O(abs(arr1.size - arr2.size))
     */
    private fun diff(arr1: IntArray, arr2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        if (arr1.isEmpty() || arr2.isEmpty()) {
            return result.toIntArray()
        }
        val iterator1 = arr1.iterator()
        val iterator2 = arr2.iterator()

        var cur1: Int? = iterator1.nextInt()
        var cur2: Int? = iterator2.nextInt()
        while (cur1 != null || cur2 != null) {
            if (cur1 != null && cur2 != null && cur1 < cur2) {
                result.add(cur1)
                cur1 = getNext(iterator1)
            } else if (cur1 != null && cur2 != null && cur2 < cur1) {
                result.add(cur2)
                cur2 = getNext(iterator2)
            } else if (cur1 != null && cur2 == null) {
                result.add(cur1)
                cur1 = getNext(iterator1)
            } else if (cur1 == null && cur2 != null) {
                result.add(cur2)
                cur2 = getNext(iterator2)
            } else if (cur1 == cur2) {
                cur1 = getNext(iterator1)
                cur2 = getNext(iterator2)
            }
        }

        return result.toIntArray()
    }

    /**
     * Time complexity O(min(arr1.size, arr2.size))
     * Space complexity O(arr1.size ^ arr2.size)
     */
    private fun intersect(arr1: IntArray, arr2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        if (arr1.isEmpty() || arr2.isEmpty()) {
            return result.toIntArray()
        }
        val iterator1 = arr1.iterator()
        val iterator2 = arr2.iterator()

        var cur1: Int? = iterator1.nextInt()
        var cur2: Int? = iterator2.nextInt()
        while (cur1 != null && cur2 != null) {
            when {
                cur1 == cur2 -> {
                    result.add(cur1)
                    result.add(cur2)
                    cur1 = getNext(iterator1)
                    cur2 = getNext(iterator2)
                }
                cur1 < cur2 -> {
                    cur1 = getNext(iterator1)
                }
                cur2 < cur1 -> {
                    cur2 = getNext(iterator2)
                }
            }
        }

        return result.toIntArray()
    }

    /**
     * Time complexity O(arr1.size + arr2.size)
     * Space complexity O(arr1.size + arr2.size)
     */
    private fun merge(arr1: IntArray, arr2: IntArray): IntArray {
        val result = IntArray(arr1.size + arr2.size)
        if (arr1.isEmpty() || arr2.isEmpty()) {
            return result
        }

        val iterator1 = arr1.iterator()
        val iterator2 = arr2.iterator()

        var pos = 0
        var cur1: Int? = iterator1.nextInt()
        var cur2: Int? = iterator2.nextInt()
        while (cur1 != null || cur2 != null) {
            if (cur1 == null && cur2 != null) {
                result[pos] = cur2
                cur2 = getNext(iterator2)
            } else if (cur1 != null && cur2 == null) {
                result[pos] = cur1
                cur1 = getNext(iterator1)
            } else if (cur1 != null && cur2 != null) {
                if (cur1 <= cur2) {
                    result[pos] = cur1
                    cur1 = getNext(iterator1)
                } else {
                    result[pos] = cur2
                    cur2 = getNext(iterator2)
                }
            }
            pos++
        }

        return result
    }

    private fun getNext(iterator: IntIterator) =
        if (iterator.hasNext()) {
            iterator.nextInt()
        } else {
            null
        }
}