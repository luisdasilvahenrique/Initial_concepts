fun main() {
    print("Enter your name: ")
    val name = readLine() // readLine() returns a String?
    println("Hello, $name!")

    print("Enter your age: ")
    var num = readLine()?.toInt() ?: 0
    println("Oww you are $num years old :)")

    print("Enter your weight: ")
    var dooble = readLine()?.toDouble() ?: 0.0
    println("Your weight is $dooble kg, $name")
}