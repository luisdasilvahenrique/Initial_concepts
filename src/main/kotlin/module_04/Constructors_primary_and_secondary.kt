package module_04

class Wild(private val name: String){
    // Secondary constructor
    private var atk: Int = 0
    constructor(name: String, atk: Int) : this(name){
        this.atk = atk
    }
    // Member function
    fun animals(){
        println("My animal is $name and it's attack is $atk")
    }
}

fun main() {
    // Primary constructor
    val animal = Wild("Tiger")
    val animal2 = Wild("Lion", 1000)

    animal.animals()
    animal2.animals()
}