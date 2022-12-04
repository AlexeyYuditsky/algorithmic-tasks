package tasks

import java.io.File

const val PATH = "C:\\Users\\1\\Desktop\\Kt\\src\\main\\kotlin\\test\\tasks\\test.txt"

fun main(args: Array<String>) {
    val cmd = args.getOrNull(0)?.lowercase()

    val result = File(PATH).useLines { lines: Sequence<String> ->
        when (cmd) {
            "sequence" -> lines
                .map { element: String -> element.filter { c: Char -> !".,".contains(c) } }
                .flatMap { element -> element.split(" ") }
                .find { it.length >= 5 }

            "list" -> lines
                .toList()
                .map { element: String -> element.filter { c: Char -> !".,".contains(c) } }
                .flatMap { element -> element.split(" ") }
                .find { it.length >= 5 }

            "loops" -> {
                val iterator = lines.iterator()
                for (line in iterator) {
                    val words = line.filter { c: Char -> !".,".contains(c) }.split(" ")
                    for (word in words) {
                        if (word.length >= 5) {
                            return@useLines word
                        }
                    }
                }
                return@useLines null
            }

            else -> null
        }
    }

    println(result)
}