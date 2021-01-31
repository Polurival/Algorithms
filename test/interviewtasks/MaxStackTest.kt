package interviewtasks

import org.junit.Assert.*
import org.junit.Test

/**
 * @author Польщиков Юрий on 31/01/2021
 */
class MaxStackTest {

    private val maxStack = MaxStack<Int>()

    @Test
    fun test() {
        assertNull(maxStack.remove())
        assertNull(maxStack.getMax())

        maxStack.add(2)
        maxStack.add(5)
        maxStack.add(5)
        maxStack.add(3)
        maxStack.add(6)

        assertEquals(6, maxStack.getMax())

        maxStack.remove()
        assertEquals(5, maxStack.getMax())

        maxStack.remove()
        assertEquals(5, maxStack.getMax())

        maxStack.remove()
        assertEquals(5, maxStack.getMax())

        maxStack.remove()
        assertEquals(2, maxStack.getMax())

        maxStack.remove()
        assertNull(maxStack.getMax())
    }
}