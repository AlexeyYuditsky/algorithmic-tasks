package com.alexeyyuditsky.algorithmictasks.grokalgorithms

fun quickSort(list: List<Int>): List<Int> {
    if (list.size <= 1) return list
    val pivot = list[list.size / 2]
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }
    return quickSort(less) + pivot + quickSort(greater)
}

fun main() {
    val list = listOf(4, 5, 2, 3, 1)
    val sortedList = quickSort(list)
    println(sortedList)
}