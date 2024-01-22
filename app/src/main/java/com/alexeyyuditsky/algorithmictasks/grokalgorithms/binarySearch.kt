package com.alexeyyuditsky.algorithmictasks.grokalgorithms

fun main() {
    val sortedArray = List(10) { it + 1 }
    println(sortedArray)
    print(sortedArray.binarySearch1(2))
}

/**
 * Выполняется за логарифмическое время: O(Log n)
 * */
fun List<Int>.binarySearch1(target: Int): Int? {
    var min = 0
    var max = lastIndex
    while (min <= max) {
        val mid = (min + max) / 2
        val guess = this[mid]
        if (guess == target) return mid
        if (guess > target) max = mid - 1
        else min = mid + 1
    }
    return null
}
