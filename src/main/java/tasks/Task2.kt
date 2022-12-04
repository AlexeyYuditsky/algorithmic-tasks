package tasks

/**
Нужно извлечь индекс из строки и с помощью индекса расположить строку в нужной позиции.
Список строк на входе разделены символом переноса строки.
 */

fun main() {
    val strings = "3s\n6tr\nsm2th\nb5labla\n4ss\nasd1"
    val stringsList = mutableListOf<String>()
    var tempString = ""

    for (i in strings.indices) {
        if (!strings[i].isWhitespace()) {
            tempString += strings[i]
        } else {
            stringsList.add(tempString)
            tempString = ""
        }
        if (i == strings.length - 1) {
            stringsList.add(tempString)
        }
    }

    var tempIndex = 0
    var tempValue = ""
    val finalStringList = arrayOfNulls<String>(stringsList.size)
    for (i in stringsList) {
        val chars = i.toCharArray()
        for (j in chars) {
            if (j.isLetter()) {
                tempValue += j
            }
            if (j.isDigit()) {
                tempIndex = j.toString().toInt() - 1
            }
        }
        finalStringList[tempIndex] = tempValue
        tempValue = ""
    }

    println(finalStringList.toList())
}