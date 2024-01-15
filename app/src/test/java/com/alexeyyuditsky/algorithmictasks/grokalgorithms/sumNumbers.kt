package com.alexeyyuditsky.algorithmictasks.grokalgorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class SumNumbers {

    @Test
    fun `sum1 1,2,3,4,5 == 15`() {
        val actual = sum1(listOf(1,2,3,4,5))
        assertEquals(15, actual)
    }

    @Test
    fun `sum2 1,2,3,4,5 == 15`() {
        val actual = sum2(listOf(1,2,3,4,5))
        assertEquals(15, actual)
    }

    @Test
    fun `sum1 2,4,6 == 12`() {
        val actual = sum1(listOf(2,4,6))
        assertEquals(12, actual)
    }

    @Test
    fun `sum2 2,4,6 == 12`() {
        val actual = sum2(listOf(2,4,6))
        assertEquals(12, actual)
    }

    @Test
    fun `sum1 empty == 0`() {
        val actual = sum1(listOf())
        assertEquals(0, actual)
    }

    @Test
    fun `sum2 empty == 0`() {
        val actual = sum2(listOf())
        assertEquals(0, actual)
    }
}