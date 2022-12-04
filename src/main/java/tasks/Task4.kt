package tasks

/**
Нужно подсчитать количество повторений каждого слова и вывести самые короткие слова
 */

fun main() {
    val input = "Kotlin functions are first-class, which means they can be stored in variables and data structures, " +
            "and can be passed as arguments to and returned from other higher-order functions."

    val words = input
        .lowercase()
        .filterNot { ".,".contains(it) }
        .split(" ")
        .toMutableList()

    println(words)
}