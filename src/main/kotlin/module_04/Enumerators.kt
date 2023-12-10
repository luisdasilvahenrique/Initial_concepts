package module_04

enum class Enumerators {
    //priority
    Baixo, Medio, Alto
}

enum class Animals{
    Cachorro, Gato, Pato, Galinha
}

fun priority(p: Enumerators){

}
fun main() {
    println("------------------")
    for (p in Enumerators.entries){
        println(p)
    }
    println("------------------")
for (a in Animals.entries){
        println(a)
    }
}