package com.alexeyyuditsky.algorithmictasks.leetcode

fun main() {
    val res = romanToInt("MMM")
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
    con@ for (i in str.indices) {
        when (str[i]) {
            'I' -> {
                when {
                    i == str.length - 1 -> result += map[str[i]]!!

                    str[i + 1] == 'V' || str[i + 1] == 'X' -> {
                        result = result + map[str[i + 1]]!! - map[str[i]]!!
                        continue@con
                    }

                    else -> result += map[str[i]]!!
                }
            }

            'V' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'I' -> continue@con
                    else -> result += map[str[i]]!!
                }
            }

            'X' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'I' -> continue@con

                    i + 1 > str.length - 1 -> result += map[str[i]]!!

                    str[i + 1] == 'L' || str[i + 1] == 'C' -> {
                        result = result + map[str[i + 1]]!! - map[str[i]]!!
                        continue@con
                    }

                    else -> result += map[str[i]]!!
                }
            }

            'L' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'X' -> continue@con
                    else -> result += map[str[i]]!!
                }
            }

            'C' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'X' -> continue@con

                    i + 1 > str.length - 1 -> result += map[str[i]]!!

                    str[i + 1] == 'D' || str[i + 1] == 'M' -> {
                        result = result + map[str[i + 1]]!! - map[str[i]]!!
                        continue@con
                    }

                    else -> result += map[str[i]]!!
                }
            }

            'D' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'C' -> continue@con
                    else -> result += map[str[i]]!!
                }
            }

            'M' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'C' -> continue@con
                    else -> result += map[str[i]]!!
                }
            }
        }
    }

    return result
}