//class Person(val name: String, var age: Int)

class Person(val name: String, var age: Int, var weight: Double){
    var years_old: Int = 2000
    fun greeting(){
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person("John", 25, 80.0)
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Weight: ${person.weight}")
    println("your year of birth is: ${person.years_old}")
    person.greeting()
}