package medium

/**
 * Related Topics: Array, Math
 *
 * Time complexity O(1) (because of num <= 10^8, more exactly O(numStr.length * numStr.length))
 * Space complexity O(1)
 */
class T670MaximumSwap {

    /**
     * My slow solution
     */
    fun maximumSwap(num: Int): Int {
        val numStr = num.toString()
        if (numStr.length < 2) {
            return num
        }
        val numArray = IntArray(numStr.length) { i -> (numStr[i]).toString().toInt() }

        // find min number
        var min = -1
        var minPos = -1
        for (i in 0 until numArray.size - 1) {
            min = numArray[i]
            minPos = i
            var isMinFounded = false
            for (j in i until numArray.size) {
                if (numArray[j] > min) {
                    isMinFounded = true
                    break
                }
            }
            if (isMinFounded) {
                break
            }
        }

        // find max number
        var max = -1
        var maxPos = -1
        for (i in numArray.size - 1 downTo minPos) {
            if (numArray[i] > min && numArray[i] > max) {
                max = numArray[i]
                maxPos = i
            }
        }
        if (maxPos == -1) {
            return num
        }

        // swap min and max
        numArray[minPos] = max
        numArray[maxPos] = min

        return numArray.joinToString("").toInt()
    }

    /**
     * Fast solution, hard to understand
     */
    fun maximumSwapFast(num: Int): Int {
        val charArray = num.toString().toCharArray()
        val digitLastIndexArray = IntArray(10)
        for (i in charArray.indices) {
            digitLastIndexArray[charArray[i] - '0'] = i
        }

        for (i in charArray.indices) {
            for (d in 9 downTo (charArray[i] - '0' + 1)) {
                if (digitLastIndexArray[d] > i) {
                    val tmp = charArray[i]
                    charArray[i] = charArray[digitLastIndexArray[d]]
                    charArray[digitLastIndexArray[d]] = tmp
                    return Integer.valueOf(String(charArray))
                }
            }
        }
        return num
    }

    /**
     * Fast and more easy solution
     */
    fun maximumSwapFastSecond(num: Int): Int {
        if (num < 10) return num

        val numStr = num.toString()
        var maxNum = num

        for (i in 0 until numStr.length) {
            val maxPos = numStr.maxPosFrom(i)
            val bigger = numStr.swap(i, maxPos).toInt()
            if (i != maxPos) return bigger
            if (bigger > maxNum) maxNum = bigger
        }

        return maxNum
    }

    fun String.maxPosFrom(index: Int): Int {
        var maxPos = index

        for (i in this.length - 1 downTo index + 1) {
            if (this[i] > this[maxPos]) {
                maxPos = i
            }
        }

        return maxPos
    }

    fun String.swap(first: Int, second: Int): String {
        val array = this.toCharArray()
        val temp = array[first]
        array[first] = array[second]
        array[second] = temp
        return array.joinToString("")
    }
}