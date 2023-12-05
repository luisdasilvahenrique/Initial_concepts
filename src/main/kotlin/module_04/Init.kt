package module_04

class Animal(private var specie: String){
    var fala: String = ""
    init {
        fala = if (specie == "Dog"){
            "Au au"
        } else if (specie == "Cat"){
            "Miau"
        } else {
            "Não sei o que falar"
        }
    }

    init {
        println(fala)
    }
    fun speak(){
        println(fala)
    }
}

fun main() {
    var animal = Animal("Dog")
    Animal("Cat").speak()
    Animal("Dog").fala
}