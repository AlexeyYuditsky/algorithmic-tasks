package com.alexeyyuditsky.algorithmictasks.leetcode

fun main() {
    val res = romanToInt("IX")
    println(res)
}

fun romanToInt(str: String): Int {
    val map = mutableMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    for (i in str.indices)
        when (str[i]) {
            'I' -> {
                if (i == str.length - 1) {
                    result += map[str[i]]!!
                } else if (str[i + 1] == str[i]) {
                    result += map[str[i]]!!
                } else if (str[i + 1] == 'V' || str[i + 1] == 'X') {
                    result = result + map[str[i + 1]]!! - 1
                    break
                }
            }

            'V' -> {
                result += map[str[i]]!!
            }

            'X' -> {
                result += map[str[i]]!!
            }

            'L' -> {
                result += map[str[i]]!!
            }

            'C' -> {
                result += map[str[i]]!!
            }

            'D' -> {
                result += map[str[i]]!!
            }

            'M' -> {
                result += map[str[i]]!!
            }
        }

    return result
}