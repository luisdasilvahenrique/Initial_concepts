package module_04

//private -> só pode ser acessado dentro da classe
//protected -> só pode ser acessado dentro da classe e nas classes filhas
//internal -> só pode ser acessado dentro do módulo

open class Eletronico(marca: String){
   private fun ativarCorrente() {

    }

    protected fun realizarTeste() {
    println("Testando protected")
    }

    fun ligar() {
        println("Ligando")
    }
    fun desligar() {
        println("Desligando")
    }

    var modelo: String = "teste de herança"
}

class Computador(marca: String):Eletronico(marca){
    fun instalarSO() {
        println("Instalando SO")
        realizarTeste() // protected pode ser acessado dentro da classe filha
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
    println(c.modelo)
}