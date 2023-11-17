fun imprimirMessage(){ // função sem retorno e sem parâmetros
    println("Hello World")
}

fun somar(a: Int, b: Int):Int { // função com retorno e com parâmetros
    return a + b
}

fun main() { // função principal
    imprimirMessage() // chamando a função
    val x = 2 // variáveis
    val y = 12 // variáveis
    print(somar(x, y)) // chamando a função e passando os parâmetros
    println(" ")  // espaço entre as funções
    divisao(x, y) // chamando a função e passando os parâmetros
}

fun divisao(a: Int, b: Int){ // função sem retorno e com parâmetros
    print("A divisão de $a e $b é: ${a/b}")
}
