package medium

import org.junit.Test

import org.junit.Assert.*

class T54SpiralMatrixTest {

    @Test
    fun spiralOrder() {
        val t54SpiralMatrix = T54SpiralMatrix()

        //testCase1
        var matrix = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
        //printMatrix(matrix)
        var spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        //println(spiralOrder)
        assertEquals("[1, 2, 3, 6, 9, 8, 7, 4, 5]", spiralOrder.toString())

        //testCase2
        matrix = arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8), intArrayOf(9,10,11,12))
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]", spiralOrder.toString())

        //testCase3
        matrix = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9), intArrayOf(10,11,12))
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8]", spiralOrder.toString())

        //testCase4
        matrix = arrayOf(intArrayOf(1,2), intArrayOf(3,4), intArrayOf(5,6), intArrayOf(7, 8))
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[1, 2, 4, 6, 8, 7, 5, 3]", spiralOrder.toString())

        //testCase5
        matrix = arrayOf(intArrayOf(1,2,3,4,5), intArrayOf(6,7,8,9,10))
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[1, 2, 3, 4, 5, 10, 9, 8, 7, 6]", spiralOrder.toString())

        //testCase6
        matrix = arrayOf(intArrayOf(1,2), intArrayOf(3,4))
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[1, 2, 4, 3]", spiralOrder.toString())

        //testCase6
        matrix = arrayOf(intArrayOf(1))
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[1]", spiralOrder.toString())

        //testCase7
        matrix = arrayOf(intArrayOf())
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[]", spiralOrder.toString())

        //testCase8
        matrix = arrayOf()
        spiralOrder = t54SpiralMatrix.spiralOrder(matrix)
        assertEquals("[]", spiralOrder.toString())
    }

    private fun printMatrix(matrix: Array<IntArray>) {
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                print(matrix[i][j])
            }
            println()
        }
    }
}