package module_03

fun main() {
    var name: String? = null
    println(name?.length)
    name = "Kotlin"
    println(name?.length)

    var age: Int? = null
    println(age)
    age = 18
    println(age)
}