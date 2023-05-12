package com.alexeyyuditsky.algorithmictasks.leetcode

import org.junit.Test

import org.junit.Assert.*

class RomanToInteger13 {

    @Test
    fun test_1() {
        val actual = romanToInt("III")
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun test_2() {
        val actual = romanToInt("LVIII")
        val expected = 58

        assertEquals(expected, actual)
    }

    @Test
    fun test_3() {
        val actual = romanToInt("MCMXCIV")
        val expected = 1994

        assertEquals(expected, actual)
    }

    @Test
    fun test_4() {
        val actual = romanToInt("XLIX")
        val expected = 49

        assertEquals(expected, actual)
    }

    @Test
    fun test_5() {
        val actual = romanToInt("XLIV")
        val expected = 44

        assertEquals(expected, actual)
    }

    @Test
    fun test_6() {
        val actual = romanToInt("L")
        val expected = 50

        assertEquals(expected, actual)
    }

    @Test
    fun test_7() {
        val actual = romanToInt("LX")
        val expected = 60

        assertEquals(expected, actual)
    }

}