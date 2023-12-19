package module_04

abstract class Mamifero(val nome: String){ // Classe abstrata não pode ser instanciada diretamente (não pode ser criado um objeto a partir dela)
   abstract fun habitat()
   abstract fun fala()
   abstract fun come()
}

 class Cachorro(nome: String): Mamifero(nome){
   override fun fala(){
        println("Au au")
    }
   override fun come(){
         println("Ração")
    }
   override fun habitat(){
          println("Terra")
   }
}

fun main() {
    val d:Cachorro = Cachorro("Rex")
    println(d.nome)
    d.habitat()
    d.fala()
    d.come()
}