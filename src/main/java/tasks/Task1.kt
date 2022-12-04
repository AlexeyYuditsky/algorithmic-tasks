package tasks

/**
Определяем количесвто введённых строк и нужно из них найти самую популярную первую букву.
 */

fun main() {
    val listOfStrings: List<String> = readInputText()
    val listOfChars: List<Char> = takeFirstCharacters(listOfStrings)
    val mapOfRepeatedCharacters: Map<Char, Int> = getListOfRepeatCharacter(listOfChars)
    val mostRepeatedCharacter: Char = findMostRepeatedCharacter(mapOfRepeatedCharacters)
    println(mostRepeatedCharacter)
}

fun readInputText(): List<String> {
    val numberOfLines = readLine()?.toInt()!!
    val listOfStrings = mutableListOf<String>()
    for (i in 0 until numberOfLines) {
        val string = readLine().toString()
        listOfStrings.add(string)
    }
    return listOfStrings
}

fun takeFirstCharacters(listOfStrings: List<String>): List<Char> {
    val firstCharacter = 0
    val listOfChars = mutableListOf<Char>()
    for (i in listOfStrings.indices) {
        listOfChars.add(listOfStrings[i][firstCharacter])
    }
    return listOfChars
}

fun getListOfRepeatCharacter(listOfChars: List<Char>): Map<Char, Int> {
    val mapOfRepeatedCharacters = mutableMapOf<Char, Int>()
    var count = 0
    for (i in listOfChars.indices) {
        for (j in listOfChars.indices) {
            if (i == j) continue
            if (listOfChars[i] == listOfChars[j]) count++
        }
        mapOfRepeatedCharacters[listOfChars[i]] = count
        count = 0
    }
    return mapOfRepeatedCharacters
}

fun findMostRepeatedCharacter(mapOfRepeatedCharacters: Map<Char, Int>): Char {
    var maxValue = 0
    var character: Char? = null
    for ((key, value) in mapOfRepeatedCharacters) {
        if (value >= maxValue) {
            maxValue = value
            character = key
        }
    }
    return character!!
}