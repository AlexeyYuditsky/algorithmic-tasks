package tasks

fun main() {
    val array = mutableListOf('a', 'b', 'c', 'a', 'b')
    val map = mutableMapOf<Char, Int>()

    for (i in array) {
        var currentCount = map[i] ?: 0
        map[i] = ++currentCount
    }

    println(map)
}