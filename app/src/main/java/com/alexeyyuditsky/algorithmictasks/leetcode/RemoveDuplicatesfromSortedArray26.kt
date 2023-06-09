package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * */
fun main() {
    val intArray = intArrayOf(1, 1, 2, 2, 3)
    val res = removeDuplicates(intArray)
    println("k = $res")
    println("intArray = ${intArray.toList()}")
}

fun removeDuplicates(nums: IntArray): Int {

    // если у элемента есть дубликат, то в месте где дубликат установить следующий элемент списка

    for (i in nums.indices) { // 0
        for (j in i + 1 until nums.size) { // 1

        }
    }

    println(nums.toList())
    return nums.size
}