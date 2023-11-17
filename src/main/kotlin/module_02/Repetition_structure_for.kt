fun main() {
    for (i in 1..10){
        print(i)
    }
    println(" ")
    for(i in 10 downTo 1){
        print(i)
    }
    println(" ")
    val pharse: String = "Kotlin is a great language"
    for(variable in pharse){
        print("$variable ")
    }

    println(" ")
    for (i in 1 ..  20 step 2){
        print("$i ")
    }
}