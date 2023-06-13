package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * */
fun main() {
    val intArray = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val res = removeDuplicates2(intArray)
    println("k = $res")
    println("intArray = ${intArray.toList()}")
}

fun removeDuplicates2(nums: IntArray): Int {
    var counter = 0

    for (i in 1 until nums.size) {
        if (nums[counter] != nums[i]) {
            counter++
            nums[counter] = nums[i]
        }
    }
    return counter + 1
}

fun removeDuplicates(nums: IntArray): Int {
    for (i in nums.indices) {
        for (j in 1 until nums.size) {
            if (nums[i] == nums[j]) nums[j] = Int.MAX_VALUE
            if (nums[i] > nums[j]) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
    }

    return nums.count { it != Int.MAX_VALUE }
}