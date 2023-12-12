package module_04

class Object{
    fun amanhecer(hour: Int){
        if (hour <= 5 && hour >= 0){
            println("Está amanhecendo")
        }else{
            println("Não está amanhecendo")
        }
    }
    fun acordar(sleeping: Boolean){
        if (sleeping){
            println("Está dormindo")
        }else{
            println("Não está dormindo")
        }

    }
}

fun main() {
    val obj: Object = Object()
    obj.amanhecer(4)
    obj.acordar(true)
    println("--------------------------------------------------")
    with(obj){
        amanhecer(4)
        acordar(true)
    }
}