fun main() {
    var str: String? = null
    str = "Luis"
    if (str != null){
        println("Caiu no if")
    }
    str?.let {
        println("Caiu no let")
    }
}