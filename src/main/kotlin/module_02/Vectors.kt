fun main() {
    vetorNumber()
    vetorCity()
    vetorFloat()
}

fun vetorNumber(){
    val vectors = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    for ( i in 0.. vectors.size - 1){
        println(vectors[i])
    }
}

fun vetorCity(){
    val str = arrayOf("Mombaça", "Fortaleza", "Quixadá", "Quixeramobim", "Senador Pompeu")
    for ( i in 0.. str.size - 1){
        println(str[i])
    }
}

fun vetorFloat(){
    var numbers_float = floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
    for ( i in 0.. numbers_float.size - 1){
        println(numbers_float[i])
    }
}