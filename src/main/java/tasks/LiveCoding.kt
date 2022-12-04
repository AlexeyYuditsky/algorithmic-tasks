package tasks

fun main() {

}

fun isPalindrome(text: String): Boolean {
    val reversedText = text.reversed()
    return text.equals(reversedText, true)
}

fun fizzBuzz(number: Int) {
    for (i in 1..number) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("fizzbuzz")
        } else if (i % 3 == 0) {
            println("buzz")
        } else if (i % 5 == 0) {
            println("fizz")
        } else {
            println(i)
        }
    }
}

fun factorial(number: Int): Int {
    var result = 1

    for (i in 1..number)
        result *= i

    return result
}

fun vowelSearch(text: String): Int {
    val vowels = setOf('e', 'o', 'a', 'i', 'u')
    val characters = text.toCharArray()
    var count = 0

    for (element in characters)
        if (vowels.contains(element))
            count++

    return count
}

fun fibonacci(num: Int): Int {
    val result = mutableListOf(0, 1)

    for (i in 2..num) {
        val prevNum1 = result[i - 1]
        val prevNum2 = result[i - 2]
        result.add(prevNum1 + prevNum2)
    }

    return result[num]
}

fun fact(n: Int): Int {
    if (n < 0) return 0
    return if (n <= 1) 1 else n * fact(n - 1)
}

fun fibonacciRecursion(n: Int): Int {
    if (n == 0) return 0
    return if (n == 1) 1 else fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2)
}