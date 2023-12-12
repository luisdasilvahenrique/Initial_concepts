package module_04

fun main() {
    val r1: Rectangle = Rectangle(10, 20)
    val r2: Rectangle = Rectangle(10, 20)
    println(r1.equals(r2))
}

data class Rectangle(val height: Int, val width: Int)