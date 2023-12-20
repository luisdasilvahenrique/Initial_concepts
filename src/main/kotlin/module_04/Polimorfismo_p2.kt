package module_04

interface dev{
   var salario: Float
    fun bonus(): Float
}

class devMobile(override var salario: Float): dev{
   override fun bonus(): Float {
        return salario * 0.2f
    }
}

class devWeb(override var salario: Float): dev{
    override fun bonus() : Float {
        return salario * 0.3f
    }
}

class devFullStack(override var salario: Float): dev{
    override fun bonus(): Float{
        return salario * 0.5f
    }
}

// Polimorfismo
fun mostrarBonus(d: dev) { // devMobile, devWeb, devFullStack -> dev
    println("O bonus do dev é: ${d.bonus()}")
}

fun main() {
    val m = devMobile(1000f)
    val w = devWeb(1000f)
    val f = devFullStack(1000f)

    mostrarBonus(m)
    mostrarBonus(w)
    mostrarBonus(f)
}