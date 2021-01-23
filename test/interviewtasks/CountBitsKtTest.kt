package interviewtasks

import org.junit.Test

import org.junit.Assert.*

/**
 * @author Польщиков Юрий on 23/01/2021
 */
class CountBitsKtTest {

    @Test
    fun countBits() {
        //Number = 177
        //Binary = 10110001
        //Number of one bits = 4
        assertEquals(4, 177.countBits())

        assertEquals(2, 6.countBits())
        assertEquals(3, 13.countBits())
    }
}