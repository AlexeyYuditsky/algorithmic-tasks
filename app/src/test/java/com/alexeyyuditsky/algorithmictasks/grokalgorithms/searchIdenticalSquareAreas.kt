package com.alexeyyuditsky.algorithmictasks.grokalgorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class SearchIdenticalSquareAreas {

    @Test
    fun `search square == 80 with x = 1680 and y = 640`() {
        val actual = searchIdenticalSquareAreas(1680, 640)
        assertEquals(80, actual)
    }

    @Test
    fun `search square == 80 with x = 640 and y = 1680`() {
        val actual = searchIdenticalSquareAreas(640, 1680)
        assertEquals(80, actual)
    }

    @Test
    fun `search square == 50 with x = 100 and y = 150`() {
        val actual = searchIdenticalSquareAreas(100, 150)
        assertEquals(50, actual)
    }

    @Test
    fun `search square == 10 with x = 110 and y = 50`() {
        val actual = searchIdenticalSquareAreas(110, 50)
        assertEquals(10, actual)
    }
}
