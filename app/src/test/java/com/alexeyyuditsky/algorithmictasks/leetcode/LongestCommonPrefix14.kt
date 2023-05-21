package com.alexeyyuditsky.algorithmictasks.leetcode

import org.junit.Test

import org.junit.Assert.*

class LongestCommonPrefix14 {

    @Test
    fun test_1() {
        val actual = longestCommonPrefix(arrayOf("flower","flow","flight"))
        val expected = "fl"

        assertEquals(expected, actual)
    }

    @Test
    fun test_2() {
        val actual = longestCommonPrefix(arrayOf("dog","racecar","car"))
        val expected = ""

        assertEquals(expected, actual)
    }

    @Test
    fun test_3() {
        val actual = longestCommonPrefix(arrayOf("c", "acc", "ccc"))
        val expected = ""

        assertEquals(expected, actual)
    }

}