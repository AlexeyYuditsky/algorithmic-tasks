package tasks

import java.io.BufferedReader
import java.io.File

const val PATH2 = "C:\\Users\\1\\Desktop\\kotlin\\src\\main\\java\\tasks\\test.txt"

fun main() {
    val result = File(PATH2).bufferedReader().use(BufferedReader::readText)
    println(result)
}
