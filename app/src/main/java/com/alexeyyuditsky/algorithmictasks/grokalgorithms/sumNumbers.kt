package com.alexeyyuditsky.algorithmictasks.grokalgorithms

fun main() {
    val list = listOf(2, 4, 6)
    val sum = sum1(list)
    println(sum)
}

fun sum2(list: List<Int>): Int {
    if (list.isEmpty()) return 0
    return list.first() + sum2(list.drop(1))
}

fun sum1(list: List<Int>): Int {
    if (list.isEmpty()) return 0
    var counter = 0
    list.forEach {
        counter += it
    }
    return counter
}