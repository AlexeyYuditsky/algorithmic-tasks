package com.alexeyyuditsky.algorithmictasks.grokalgorithms

import kotlin.math.max
import kotlin.math.min

fun main() {
    val res = searchIdenticalSquareAreas(110, 50)
    println("min square: $res")
}

fun searchIdenticalSquareAreas(x: Int, y: Int): Int {
    if (x % y == 0) return min(x, y)
    val newX = min(x, y)
    val newY = max(x, y) % min(x, y)
    return searchIdenticalSquareAreas(newX, newY)
}