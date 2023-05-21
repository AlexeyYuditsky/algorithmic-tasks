package com.alexeyyuditsky.algorithmictasks.leetcode

fun main() {
    val res = longestCommonPrefix(arrayOf("c", "acc", "ccc"))
    println(res)
}

fun longestCommonPrefix(strs: Array<String>): String {
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