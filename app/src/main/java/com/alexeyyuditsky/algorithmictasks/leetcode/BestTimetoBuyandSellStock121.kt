package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * */
fun main() {
    val res = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    println(res)
}

fun maxProfit(prices: IntArray): Int {
    var max = 0
    var min = prices[0]
    prices.forEach {
        if (min < it) {
            max = if (it - min < max) max else it - min
        } else {
            min = it
        }
    }
    return max
}