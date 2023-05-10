package com.alexeyyuditsky.algorithmictasks.leetcode

fun main() {
    val res = romanToInt("III")
    println(res)
}

fun romanToInt(s: String): Int {
    val map = mutableMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    for (c in s)
        when (c) {
            'I' -> result += 1
        }

    return result
}