package module_04

interface Evento{
    fun onClick(){

    }
}

class Programa{
    fun salvar(e: Evento){
        println("Evento salvo")
        e.onClick()
    }
}

fun main() {
     val p: Programa = Programa()
    p.salvar(object : Evento{
            override fun onClick() {
                println("Evento clicado")
            }
        })
}