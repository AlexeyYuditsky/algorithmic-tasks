package com.alexeyyuditsky.algorithmictasks.leetcode

import org.junit.Test

import org.junit.Assert.*

/**
 * https://leetcode.com/problems/valid-parentheses/
 */

class ValidParentheses20 {

    @Test
    fun test_1() {
        val actual = isValid("()")
        val expected = true

        assertEquals(expected, actual)
    }

    @Test
    fun test_2() {
        val actual = isValid("()[]{}")
        val expected = true

        assertEquals(expected, actual)
    }

    @Test
    fun test_3() {
        val actual = isValid("(]")
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun test_4() {
        val actual = isValid("([)]")
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun test_5() {
        val actual = isValid(")[")
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun test_6() {
        val actual = isValid("(){}}{")
        val expected = false

        assertEquals(expected, actual)
    }

}