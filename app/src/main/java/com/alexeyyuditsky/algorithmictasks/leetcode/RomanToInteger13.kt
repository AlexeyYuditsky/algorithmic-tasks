package com.alexeyyuditsky.algorithmictasks.leetcode

fun main() {
    val res = romanToInt("LX")
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
    for (i in str.indices) {
        when (str[i]) {
            'I' -> {
                when {
                    // if now last index
                    i == str.length - 1 -> result += map[str[i]]!!

                    // if value with next index == V or X then get V or X and subtract value with current index and return
                    str[i + 1] == 'V' || str[i + 1] == 'X' -> {
                        result = result + map[str[i + 1]]!! - map[str[i]]!!
                        continue
                    }

                    else -> result += map[str[i]]!!
                }
            }

            'V' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'I' -> continue
                    else -> result += map[str[i]]!!
                }
            }

            'X' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'I' -> continue


                    i + 1 > str.length - 1 -> result += map[str[i]]!!

                    str[i + 1] == 'L' || str[i + 1] == 'C' -> {
                        result = result + map[str[i + 1]]!! - map[str[i]]!!
                        continue
                    }

                    else -> result += map[str[i]]!!
                }
            }

            'L' -> {
                when {
                    i - 1 >= 0 && str[i - 1] == 'X' -> continue
                    else -> result += map[str[i]]!!
                }
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
    }

    return result
}