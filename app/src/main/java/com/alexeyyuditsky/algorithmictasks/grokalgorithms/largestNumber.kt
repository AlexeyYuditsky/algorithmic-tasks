package com.alexeyyuditsky.algorithmictasks.grokalgorithms

fun main() {
    val list = listOf(4, 1, 5, 3)
    val res = largestNumber2(list)
    println(res)
}

fun largestNumber2(list: List<Int>): Int {
    if (list.isEmpty()) return 0

    var largestNumber = 0
    for (i in list.indices) {
        if (list[i] > largestNumber)
            largestNumber = list[i]
    }
    return largestNumber
}

fun largestNumber1(list: List<Int>): Int {
    if (list.isEmpty())
        return 0

    val head = list.first()
    val tail = list.drop(1)
    val maxValue = largestNumber1(tail)
    return if (head > maxValue) head else maxValue
}