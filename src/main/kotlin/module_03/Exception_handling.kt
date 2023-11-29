import java.lang.Math.sqrt

fun main() {
    val a = 10
    val b = 0
    try {
        val c = a / b
        println("Result: $c")
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    } finally {
        println("Finally block")
    }

    print("\n")

    val num = -4
    try {
        if (num < 0) {
            throw IllegalArgumentException("Raiz quadrada de número negativo")
        }
        println("Raiz quadrada de $num é ${sqrt(num.toDouble())}")
    } catch (e: IllegalArgumentException) {
        println("Exception: ${e.message}")
    } finally {
        println("Finally block")
    }
}