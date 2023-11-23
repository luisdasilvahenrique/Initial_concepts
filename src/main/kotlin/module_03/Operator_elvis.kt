package module_03

fun main() {
    var name: String? = null
//    name = "Kotlin"
    if (name == null){
        println("Name is null")
    } else {
        println("Name is not null: $name")
    }
    // operator elvis
    println("Name is: ${name ?: "Name is null"}")
}