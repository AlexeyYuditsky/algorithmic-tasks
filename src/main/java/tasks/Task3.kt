package tasks

/**
Петя решил сделать програминый фон для своего мобильного приложения.
Петя определился, что фон будет зависеть от разрешения экрана. Поэтому мы будем считать,
что экран имеет разрешение W x Н, те. Н строк пикселей по W в каждой строке.
- Найти сумму интенсивностей для каждой строки матрицы.
- Найти сумму интенсивностей для каждого столбца матрицы.

При w = 2 и h = 2
4 4
4 4

При w = 4 и h = 3
12 18 18 12
16 24 24 16
12 18 18 12

сумма строк: 60 80 60
сумма столбцов: 40 60 60 40
 */

fun main() {
    val w = 4
    val h = 3

    val map = calculateBackground1(w, h)
    findRowSum(map)
    findColumnSum(map)
}

fun calculateBackground1(w: Int, h: Int): Array<Array<Int>> {
    val map = Array(h) { Array(w) { 0 } }

    for (rowMin in 0 until h) {
        for (rowMax in 0 until h) {
            for (colMin in 0 until w) {
                for (colMax in 0 until w) {

                    for (i in rowMin..rowMax) {
                        for (j in colMin..colMax) {
                            map[i][j]++
                        }
                    }

                }
            }
        }
    }

    for (i in map) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
    println()

    return map
}

fun findRowSum(map: Array<Array<Int>>) {
    for (i in map) {
        var rowSum = 0
        for (j in i) {
            rowSum += j
        }
        print("$rowSum ")
    }
    println()
}

fun findColumnSum(map: Array<Array<Int>>) {
    for (i in map.first().indices) {
        var colSum = 0
        for (j in map.indices) {
            val res = map[j][i]
            colSum += res
        }
        print("$colSum ")
    }
}

fun calculateBackground2(w: Int, h: Int): Array<Array<Int>> {
    val map = Array(h) { Array(w) { 0 } }

    for (i in 0 until h) {
        for (j in 0 until w) {
            val x1 = i + 1;
            val y1 = j + 1;

            val x2 = h - i;
            val y2 = w - j;

            map[i][j] = x1 * y1 * x2 * y2;
        }
    }

    for (i in map) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
    println()

    return map
}