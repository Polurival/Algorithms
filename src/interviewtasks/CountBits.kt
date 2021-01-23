package interviewtasks

/**
 * Посчитать число битов в байте
 * Дано число. Нужно посчитать число единичных битов в нем.
 *
 * @author Польщиков Юрий on 23/01/2021
 */

fun Int.countBits(): Int {
    var temp = this
    var counter = 0
    while (temp > 0) {
        counter += temp and 1
        temp = temp shr 1
    }
    return counter
}