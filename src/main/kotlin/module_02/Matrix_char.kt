package module_02

fun main() {
    val rows = 3
    val cols = 3
    val matrix: Array<Array<Char>> = Array(rows) { Array(cols) { ' ' } }
    var chars = 'A'
    for (i in 0 until  rows) {
        for (j in 0 until cols) {
            matrix[i][j] = chars
            chars++
        }
    }
    print("Matrix: \n")
    for (i in 0 until  rows) {
        for (j in 0 until cols) {
            print("${matrix[i][j]} ")
        }
        println()
    }

}