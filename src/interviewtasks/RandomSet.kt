package interviewtasks

import java.util.Random
import java.util.Stack

/**
 * Реализовать структуру данных со следующими операциями:
 *
 * void add(int value) - добавить элемент в множество
 * void remove(int value) - удалить элемент из множества
 * int getRandom() - получить случайный элемент из множества.
 * Должно при этом поддерживаться равномерное распределение.
 * Все операции должны выполняться за O(1)
 *
 * @author Польщиков Юрий on 24/01/2021
 */
class RandomSet {

    var size = 0
        private set

    private val random = Random()
    private val hashMap = HashMap<Int, Int>()
    private val stack = Stack<Int>()

    fun add(value: Int) {
        hashMap[value] = size
        stack.add(value)
        size++
    }

    fun remove(value: Int) {
        hashMap[value]?.let { index ->
            val last = stack.pop()
            if (last != value) {
                stack.add(index, last)
                stack[index] = last
                hashMap[last] = index
            }
            hashMap.remove(value)
            size--
        }
    }

    fun getRandom(): Int {
        val index = random.nextInt(size)
        return stack.elementAt(index)
    }
}