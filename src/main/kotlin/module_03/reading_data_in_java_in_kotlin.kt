import java.util.Scanner

fun main() {
 readInt()
 readDouble()
 readString()
}

fun readInt(){
    var scanner = Scanner(System.`in`)
    println("Digite um número inteiro: ")
    var number = scanner.nextInt()
    println("O número digitado foi: $number")
}

fun readDouble(){
    var scanner  = Scanner(System.`in`)
    println("Digite um número real: ")
    var double = scanner.nextDouble()
    println("O número digitado foi: $double")
}

fun readString(){
    var scanner = Scanner(System.`in`)
    println("Digite uma palavra: ")
    var str = scanner.next()
    println("A palavra digitada foi: $str")
    scanner.close()
}