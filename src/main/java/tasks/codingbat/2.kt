package tasks.codingbat

import kotlin.math.abs

/**
Учитывая значение int n, верните абсолютную разницу между n и 21, за исключением возврата двойной
абсолютной разницы, если n больше 21.
 */
fun main() {
    val res = diff21(23)
    println(res)
}

fun diff21(n: Int): Int {
    return if (n <= 21) {
        21 - n
    } else {
        // (n - 21) * n
        abs(n - 21) * 2
    }
}