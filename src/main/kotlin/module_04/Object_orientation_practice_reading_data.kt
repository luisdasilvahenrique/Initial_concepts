package module_04

//class Person(val name: String, var age: Int)
class Persons(private val name: String, var age: Int, var weight: Double, var yearsOld: Int){
    fun greeting(){
        print("Hello, my name is $name")
    }
}

fun main() {
    println("Enter your name: ")
    val name: String = readlnOrNull() ?: "No name"

    println("Enter your age: ")
    val age: Int = readlnOrNull()?.toInt() ?: 0

    println("Enter your weight: ")
    val weight: Double = readlnOrNull()?.toDouble() ?: 0.0

    println("Enter your year of birth: ")
    val yearsOld: Int = readlnOrNull()?.toInt() ?: 0

   val persons = Persons(name, age, weight, yearsOld)
    persons.greeting()
    println(", I am ${persons.age} years old and I weigh ${persons.weight} kg and I was born in ${persons.yearsOld}")
}