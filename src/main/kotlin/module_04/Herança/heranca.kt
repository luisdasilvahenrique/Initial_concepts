package module_04.Herança

open class Eletronico(marca: String){
    fun ligar() {
        println("Ligando")
    }
    fun desligar() {
        println("Desligando")
    }
}

class Computador(marca: String):Eletronico(marca){
    fun instalarSO() {
        println("Instalando SO")
    }
    fun formatar() {
        println("Formatando")
    }
}

fun main() {
    val c: Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.instalarSO()
    c.formatar()
}