package module_04.Overwriting_and_Overloading

open class eletronicos(var marca: String){
    private fun corrente(ativo: Boolean){

    }
   open fun ligar(){
        corrente(true)
    }
   open fun desligar(){
        corrente(false)
    }
}

class PC(marca: String): eletronicos(marca){
    fun salvar(){}
    override fun desligar(){
        salvar()
        super.desligar()
    }
    override fun ligar(){
        super.ligar()
    }
}

// overloading
fun somar(a: Int, b: Int): Int{
    return a + b
}
fun somar(a: Int, b: Int, c: Int): Int{
    return a + b + c
}
fun somar(a: Int, b: Int, c: Int, d: Int): Int{
    return a + b + c + d
}

fun main() {
    val pc = PC("Dell")
    pc.ligar()
    pc.desligar()
    // overloading
    println(somar(1, 2))
    println(somar(1, 2, 3))
    println(somar(1, 2, 3, 4))
}