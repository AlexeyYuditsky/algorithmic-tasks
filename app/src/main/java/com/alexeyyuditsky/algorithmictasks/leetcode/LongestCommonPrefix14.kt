package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * */
fun main() {
    val res = longestCommonPrefix(arrayOf("ghfly", "flou", "flag"))
    println(res)
}

fun longestCommonPrefix(strs: Array<String>): String {
    val word = strs.first()
    for ((i, c) in word.withIndex()) {
        val result = strs.any { str ->
            str.length == i || str[i] != c
        }
        if (result)
            return word.substring(0, i)
    }
    return word
}

fun longestCommonPrefix2(strs: Array<String>): String {
    if (strs.isEmpty() || strs.first().isBlank()) return ""

    var i = 0
    var chars = strs[0][i].toString()

    while (true) {
        for (word in strs) {
            if (!word.startsWith(chars)) {
                return if (chars.length == 1)
                    ""
                else
                    return chars.filterIndexed { index, _ -> index != chars.length - 1 }
            }
        }
        if (strs[0].length == ++i)
            return chars
        else
            chars += strs[0][i]
    }
}