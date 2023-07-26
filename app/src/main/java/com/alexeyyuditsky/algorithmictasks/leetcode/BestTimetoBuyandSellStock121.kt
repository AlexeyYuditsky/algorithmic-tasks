package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * */
fun main() {
    val res = maxProfit(intArrayOf(5, 5, 1))
    println(res)
}

fun maxProfit(prices: IntArray): Int {
    var max = 0
    var min = prices[0]
    for (i in 1 until prices.size) {
        if (min < prices[i]) {
            max = (prices[i] - min).coerceAtLeast(max)
        } else {
            min = prices[i]
        }
    }
    return max
}