fun main() {
    any()
    unit()
    nothing()
}

fun any(){
    val any: Any = "Any"
    val any2: Any = 1
    val any3: Any = 1.0
    val any4: Any = true
    val any5: Any = 'a'
    val any6: Any = arrayOf(1, 2, 3)
    val any7: Any = listOf(1, 2, 3)
    val any8: Any = mapOf(1 to "one", 2 to "two", 3 to "three")

}

fun unit(){
    val unit: Unit = Unit
    val unit2: Unit = println("Unit")
    val unit3: Unit = println("Unit")
    val unit4: Unit = println("Unit")
    val unit5: Unit = println("Unit")
    val unit6: Unit = println("Unit")
    val unit7: Unit = println("Unit")
    val unit8: Unit = println("Unit")
}

fun nothing(){
    val nothing: Nothing = throw Exception()
    val nothing2: Nothing = throw Exception()
    val nothing3: Nothing = throw Exception()
    val nothing4: Nothing = throw Exception()
    val nothing5: Nothing = throw Exception()
    val nothing6: Nothing = throw Exception()
    val nothing7: Nothing = throw Exception()
    val nothing8: Nothing = throw Exception()
}