package com.alexeyyuditsky.algorithmictasks.grokalgorithms

fun quickSort(list: List<Int>): List<Int> {
    if (list.size < 2) return list
    val pivot = list[list.lastIndex / 2]
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }
    return quickSort(less) + pivot + quickSort(greater)
}

fun main() {
    val list = listOf(5, 4, 3, 2, 1)
    val sortedList = quickSort(list)
    println(sortedList)
}