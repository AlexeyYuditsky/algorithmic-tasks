package com.alexeyyuditsky.algorithmictasks.grokalgorithms

fun main() {
    val list = listOf(1, 2, 3)
    val res = countElements(list)
    println(res)
}

fun countElements(list: List<Int>): Int {
    if (list.isEmpty()) return 0
    return 1 + countElements(list.drop(1))
}