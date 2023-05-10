package com.alexeyyuditsky.algorithmictasks.leetcode

import org.junit.Assert
import org.junit.Test

class PalindromeNumber9 {

    @Test
    fun test_1() {
        val actual = isPalindrome(121)
        val expected = true

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test_2() {
        val actual = isPalindrome(-121)
        val expected = false

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test_3() {
        val actual = isPalindrome(10)
        val expected = false

        Assert.assertEquals(expected, actual)
    }

}