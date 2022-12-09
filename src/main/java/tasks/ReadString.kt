package tasks

/**
Нужно подсчитать количество повторений каждого слова и вывести самые короткие слова
 */

fun main() {
    val input = "Kotlin functions are first-class, which means they can be stored in variables and data structures, " +
            "and can be passed as arguments to and returned from other higher-order functions."
    firstOption(input)
    secondOption(input)
}

fun secondOption(input: String) {
    val words = input
        .lowercase()
        .filterNot { ".,".contains(it) }
        .split(" ")
        .toMutableList()

    val wordsCount = words.groupingBy { it }.eachCount()
    val shortestLength = words.minOf { it.length }
    val shortestWords = words.filter { it.length == shortestLength }

    println("Входные данные: $input")
    println("Самые короткие слова: ${shortestWords.joinToString(", ")}")
    print("Количество повторений: ")
    wordsCount.forEach { (key, value) -> print("$key = $value, ") }
}

fun firstOption(input: String) {
    val shortestWords = mutableListOf<String>()
    val repeatingWords = mutableMapOf<String, Int>()

    val words = input
        .lowercase()
        .filterNot { ".,".contains(it) }
        .split(" ")
        .toMutableList()

    var shortestLength = Int.MAX_VALUE
    for (word in words) {
        if (word.length < shortestLength) {
            shortestLength = word.length
        }
    }
    for (word in words) {
        if (word.length == shortestLength) {
            shortestWords.add(word)
        }
    }

    for (word in words) {
        var currentCount = repeatingWords[word] ?: 0
        repeatingWords[word] = ++currentCount
    }

    println("Входные данные: $input")
    println("Самые короткие слова: ${shortestWords.joinToString(", ")}")
    print("Количество повторений: ")
    repeatingWords.forEach { (key, value) -> print("$key = $value, ") }
}