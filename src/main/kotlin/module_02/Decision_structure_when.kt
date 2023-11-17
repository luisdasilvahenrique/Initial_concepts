fun main() {
    val positionInCompany: String = "Intership";
    when(positionInCompany){
        "CEO" -> println(6000f)
        "Manager" -> println(4000f)
        "Intership" -> println(1000f)
        else -> println("Position not found")
    }
}