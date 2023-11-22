package module_02

fun main() {
    val rows = 3
    val columns = 3
    val matrix: Array<Array<Int>> = Array(rows) { Array(columns) { 0 } }
    var count = 0
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            matrix[i][j] = count++
        }
        print(matrix[i].contentToString() + "\n")
    }
}
