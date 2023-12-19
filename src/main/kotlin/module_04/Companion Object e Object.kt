package module_04

class Matematica(){
     // escopo Classe e escopo objeto
    companion object Math{
        val PI = 3.14
        fun adc(){

        }
         init {
                println("Iniciando o companion object")
         }
    }
    object obj01{
        val PI = 3.14
        fun adc(){}
        init {
            println("Iniciando o objeto 01")
        }
    }
}

fun main() {
    println("O valor de PI é ${Matematica.PI}")
    Matematica.adc()
    println("")
    var m: Matematica = Matematica();
    println("Acessando o objeto ${Matematica.obj01.PI}")
}