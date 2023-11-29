import kotlin.math.sqrt

fun main() {
    try {
        val str: String? = null
        // str = "Luis"
        println("Tamanho da string: ${str?.length}")

        val division = 10 / 0
        println("Resultado da divisão: $division")

        val squareRoot = -10
        if (squareRoot < 0) {
            throw IllegalArgumentException()
        }

    }catch (e: NullPointerException){
        println("Exception: ${e.message}")
    }catch (e: ArithmeticException){
        println("Exception: ${e.message}")
    }catch (e: IllegalArgumentException){
        println("Exception: ${e.message}")
    }finally {
        println("Finally block")
    }
}