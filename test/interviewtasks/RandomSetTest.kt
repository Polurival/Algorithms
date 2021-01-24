package interviewtasks

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * @author Польщиков Юрий on 24/01/2021
 */
class RandomSetTest {

    private val randomSet = RandomSet()

    @Test
    fun testRandomSet() {
        randomSet.add(6)
        randomSet.add(3)
        randomSet.add(1)
        randomSet.add(7)
        randomSet.add(10)
        randomSet.add(20)
        assertEquals(6, randomSet.size)

        for (i in 0 until 10) {
            print(randomSet.getRandom())
            print(" " + randomSet.getRandom())
            print(" " + randomSet.getRandom())
            print(" " + randomSet.getRandom())
            println()
        }

        randomSet.remove(11)
        assertEquals(6, randomSet.size)
        randomSet.remove(1)
        randomSet.remove(20)
        randomSet.remove(6)
        assertEquals(3, randomSet.size)
    }
}