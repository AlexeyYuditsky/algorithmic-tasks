package com.alexeyyuditsky.algorithmictasks.grokalgorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class CountElements {

    @Test
    fun `count elements == 5 with list(1,2,3,4,5)`() {
        val actual = countElements(listOf(1,2,3,4,5))
        assertEquals(5, actual)
    }

    @Test
    fun `count elements == 0 with empty list()`() {
        val actual = countElements(listOf())
        assertEquals(0, actual)
    }
}