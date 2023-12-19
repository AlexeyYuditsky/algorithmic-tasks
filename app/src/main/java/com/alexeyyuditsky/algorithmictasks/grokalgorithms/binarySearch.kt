package com.alexeyyuditsky.algorithmictasks.grokalgorithms

/**
 * Выполняется за логарифмическое время: O(Log n)
 * */
fun List<Int>.binarySearch(item: Int): Int? {
    var min = 0
    var max = lastIndex
    while (min <= max) {
        val mid = (min + max) / 2
        val guess = this[mid]
        if (guess == item) return mid
        if (guess > item) max = mid - 1
        else min = mid + 1
    }
    return null
}

// [0, 3, 6, 9, 12, 15, 18, 21, 24, 27]
fun main() {
    val sortedArray = List(10) { it * 3 }
    println(sortedArray)
    print(sortedArray.binarySearch(6))
}