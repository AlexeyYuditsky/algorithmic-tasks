package com.alexeyyuditsky.algorithmictasks.grokalgorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class LargestNumber {

    @Test
    fun `largest number == 5 in list(1,5,2,1)`() {
        val actual1 = largestNumber1(listOf(1, 5, 2, 1))
        assertEquals(5, actual1)

        val actual2 = largestNumber2(listOf(1, 5, 2, 1))
        assertEquals(5, actual2)
    }

    @Test
    fun `largest number == 0 in empty list()`() {
        val actual1 = largestNumber1(listOf())
        assertEquals(0, actual1)

        val actual2 = largestNumber1(listOf())
        assertEquals(0, actual2)
    }

    @Test
    fun `largest number == 0 in list(-2,-3,0,-1)`() {
        val actual1 = largestNumber1(listOf(-2, -3, 0, -1))
        assertEquals(0, actual1)

        val actual2 = largestNumber1(listOf(-2, -3, 0, -1))
        assertEquals(0, actual2)
    }
}