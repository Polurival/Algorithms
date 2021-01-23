package interviewtasks

import java.util.Random

/**
 * Shuffle массива
 * Нужно написать inplace-реализацию перемешивания массива с заданным рандомизатором:
 *
 * @author Польщиков Юрий on 23/01/2021
 */

private val random = Random()

// эту функцию реализовывать не нужно
private fun random(from: Int, to: Int): Int {
    return random.nextInt(to)
}

fun IntArray.myShuffle() {
    for (i in lastIndex downTo 1) {
        val j = random(0, i + 1)
        val copy = this[i]
        this[i] = this[j]
        this[j] = copy
    }
}