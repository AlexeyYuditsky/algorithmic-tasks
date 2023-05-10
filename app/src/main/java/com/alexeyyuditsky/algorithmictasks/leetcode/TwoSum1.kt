package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/two-sum/
 */
fun main() {
    val nums = intArrayOf(2, 3, 5, 5)
    val target = 9

    val result = twoSum(nums, target)
    println(result.joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}