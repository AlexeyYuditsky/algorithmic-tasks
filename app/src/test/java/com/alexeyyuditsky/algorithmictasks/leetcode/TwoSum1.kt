package com.alexeyyuditsky.algorithmictasks.leetcode

import org.junit.Assert
import org.junit.Test

class TwoSum1 {

    @Test
    fun test_1() {
        val expected = twoSum(intArrayOf(2, 7, 11, 5), 9)
        val actual = intArrayOf(0, 1)

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun test_2() {
        val expected = twoSum(intArrayOf(3,2,4), 6)
        val actual = intArrayOf(1, 2)

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun test_3() {
        val expected = twoSum(intArrayOf(3,3), 6)
        val actual = intArrayOf(0, 1)

        Assert.assertArrayEquals(expected, actual)
    }

}