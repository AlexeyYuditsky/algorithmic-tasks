package tasks.codingbat

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Tests {

    @Test
    fun sleepIn_done() {
        val result1 = sleepIn(weekday = false, vacation = false)
        val result2 = sleepIn(weekday = true, vacation = false)
        val result3 = sleepIn(weekday = false, vacation = true)
        val result4 = sleepIn(weekday = true, vacation = true)

        assertEquals(true, result1)
        assertEquals(false, result2)
        assertEquals(true, result3)
        assertEquals(true, result4)
    }

}