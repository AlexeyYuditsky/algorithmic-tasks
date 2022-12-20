package tasks.codingbat

/**
Параметр weekday имеет значение true, если это будний день, а параметр vacation имеет значение true, если мы находимся в отпуске.
Мы спим, если это не будний день или мы в отпуске. Верните значение true, если мы будем спать.
 */
fun main() {
    val res = sleepIn(weekday = true, vacation = true)
    println(res)
}

fun sleepIn(weekday: Boolean, vacation: Boolean): Boolean {
    return !weekday || vacation
}