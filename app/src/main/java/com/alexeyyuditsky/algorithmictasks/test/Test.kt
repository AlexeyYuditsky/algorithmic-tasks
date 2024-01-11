package com.alexeyyuditsky.algorithmictasks.test

fun main() {
    val res = fact(10)
    println(res)
}

fun fact(x: Int): Int {
    if (x == 0) return 1
    return x * fact(x - 1)
}