package com.alexeyyuditsky.algorithmictasks.leetcode

fun main() {
    val nums = intArrayOf(3,2,2,3)
    val `val` = 3
    val k = removeElement(nums, `val`)
    println("$k, nums = ${nums.toList()}")
}

// [0, 1, 2, 2, 3, 0, 4, 2], val = 2

fun removeElement(nums: IntArray, `val`: Int): Int {
    var counter = nums.size

    for (i in nums.indices) {
        if (nums[i] == `val`) { // 0 // 1 // 2
            for (j in i until nums.size) {
                if (nums[j] != `val`) {
                    counter--
                    val temp = nums[i] // 2
                    nums[i] = nums[j] // 3
                    nums[j] = temp // 2
                    break
                }
            }
        }
    }

    return counter
}