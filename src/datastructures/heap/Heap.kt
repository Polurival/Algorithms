package datastructures.heap

/**
 * Make heap from array (heapify)
 * i'th - element has:
 * (2*i + 1)'th left child
 * (2*i + 2)'th right child
 *
 * @author Польщиков Юрий on 06/12/2020
 */
class Heap {

    private fun minHeapify(heapArray: IntArray, indexParam: Int, heapSize: Int) {
        var index = indexParam
        var smallest = index
        while (smallest < heapSize / 2) { // check parent nodes only
            val left = 2 * index + 1 //left child
            val right = 2 * index + 2 //right child
            if (left < heapSize && heapArray[left] < heapArray[index]) {
                smallest = left
            }
            if (right < heapSize && heapArray[right] < heapArray[smallest]) {
                smallest = right
            }
            if (smallest != index) { // swap parent with smallest child
                val temp = heapArray[index]
                heapArray[index] = heapArray[smallest]
                heapArray[smallest] = temp
                index = smallest
            } else {
                break // if heap property is satisfied
            }
        }
    }

    private fun maxHeapify(heapArray: IntArray, indexParam: Int, heapSize: Int) {
        var index = indexParam
        var largest = index
        while (largest < heapSize / 2) { // check parent nodes only
            val left = 2 * index + 1 //left child
            val right = 2 * index + 2 //right child

            if (left < heapSize && heapArray[left] > heapArray[index]) {
                largest = left
            }
            if (right < heapSize && heapArray[right] > heapArray[largest]) {
                largest = right
            }
            if (largest != index) { // swap parent with largest child
                val temp = heapArray[index]
                heapArray[index] = heapArray[largest]
                heapArray[largest] = temp
                index = largest
            } else break // if heap property is satisfied
        }
    }

    fun buildMinHeap(heapArray: IntArray?, heapSize: Int) {
        // swap smallest child to parent node
        for (i in (heapSize - 1) / 2 downTo 0) {
            minHeapify(heapArray!!, i, heapSize)
        }
    }

    fun buildMaxHeap(heapArray: IntArray, heapSize: Int) {
        // swap largest child to parent node
        for (i in (heapSize - 1) / 2 downTo 0) {
            maxHeapify(heapArray, i, heapSize)
        }
    }

    fun findKSmallest(arr: IntArray, k: Int): IntArray {
        var arraySize = arr.size
        if (k <= arraySize) {
            val result = IntArray(k)
            for (i in 0 until k) {
                buildMinHeap(arr, arraySize)
                result[i] = arr[0]
                arr[0] = arr[--arraySize]
                /*result[i] = removeMin(arr, arraySize)
                --arraySize*/
            }
            return result
        }
        println("Value of k = " + k + "out of bounds!")
        return arr
    }

    fun findKLargest(arr: IntArray, k: Int): IntArray {
        var arraySize = arr.size
        if (k <= arraySize) {
            val result = IntArray(k) // build the result array of size = k
            for (i in 0 until k) {
                buildMaxHeap(arr, arraySize)
                result[i] = arr[0]
                arr[0] = arr[--arraySize]
            }
            return result
        }
        println("Value of k = " + k + "Out of Bounds")
        return arr
    }
}