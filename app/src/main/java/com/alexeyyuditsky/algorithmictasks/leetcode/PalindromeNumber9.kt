package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/palindrome-number/
 */
fun main() {
    val res = isPalindrome2(-111)
    println(res)
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    if (x == 0) return true

    val str = x.toString()
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left++] != str[right--])
            return false
    }

    return true
}

fun isPalindrome2(x: Int): Boolean {
    return x.toString().reversed() == x.toString()
}