package medium

/**
 * Solution - go in cycle on borders of matrix narrowing borders after all 4 borders passed
 *
 * Time complexity O()
 * Space complexity O()
 */
class T54SpiralMatrix {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if (matrix.isEmpty()) {
            return emptyList()
        }
        var yStart = 0
        var yEnd = matrix.size
        var xStart = 0
        var xEnd = matrix[0].size

        val count = yEnd * xEnd
        val result = ArrayList<Int>(count)
        while (true) {

            for (i in xStart until xEnd) {
                result.add(matrix[yStart][i])
            }
            if (count == result.size) {
                break
            }

            for (i in yStart + 1 until yEnd) {
                result.add(matrix[i][xEnd - 1])
            }
            if (count == result.size) {
                break
            }

            for (i in xEnd - 2 downTo xStart) {
                result.add(matrix[yEnd - 1][i])
            }
            if (count == result.size) {
                break
            }

            for (i in yEnd - 2 downTo yStart + 1) {
                result.add(matrix[i][xStart])
            }
            if (count == result.size) {
                break
            }

            yStart++
            yEnd--
            xStart++
            xEnd--
        }

        return result
    }
}