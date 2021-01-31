package interviewtasks

import java.util.ArrayDeque

/**
 * Реализовать стэк, который за константное время может:
 * добавлять и удалять объекты
 * и из которого можно получить максимальный элемент
 *
 * @author Польщиков Юрий on 31/01/2021
 */
class MaxStack<T : Number> {

    private val elements = ArrayDeque<T>()
    private val maxStack = ArrayDeque<T>()

    fun add(value: T) {
        elements.push(value)
        if (maxStack.isNotEmpty()) {
            if (maxStack.peek().toDouble() <= value.toDouble()) {
                maxStack.push(value)
            }
        } else {
            maxStack.push(value)
        }
    }

    fun remove(): T? {
        if (elements.isEmpty()) {
            return null
        }
        val value = elements.pop()
        if (maxStack.isNotEmpty() && maxStack.peek() == value) {
            maxStack.pop()
        }
        return value
    }

    fun getMax(): T? {
        if (maxStack.isEmpty()) {
            return null
        }
        return maxStack.peek()
    }
}