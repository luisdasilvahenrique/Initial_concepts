package module_04

interface Selvagem{
    fun atacar(){
        println("Atacando")
    }
}

abstract class Mamiferos(val nome: String): Selvagem{ // Classe abstrata não pode ser instanciada diretamente (não pode ser criado um objeto a partir dela)
    abstract fun habitat()
    abstract fun fala()
    abstract fun come()
}

class Cachorros(nome: String): Mamiferos(nome){
    override fun fala(){
        println("Au au")
    }
    override fun come(){
        println("Ração")
    }
    override fun habitat(){
        println("Terra")
    }

    override fun atacar(){
        println("Atacando")
    }
}

fun main() {
    val d:Cachorros = Cachorros("Rex")
    println(d.nome)
    d.habitat()
    d.fala()
    d.come()
    d.atacar()
}