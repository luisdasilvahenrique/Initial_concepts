package module_04

// função set -> altera o valor da variável
// função get -> retorna o valor da variável
// field -> variável que armazena o valor da propriedade

class Planeta(var nome: String){
    private var id = 1
    var tamanho = 0
        get(){
            println("Acessando o get do tamanho $field")
            return field
        }
        set(value){
            println("Acessando o set do tamanho $value")
            field = value
        }
}

class Planeta2(){
    var nome: String = ""
        get(){
            println("Acessando o get do nome")
            return field
        }
        set(value){
            if (value == ""){
                println("Meu planeta tem um nome")
            }else{
                field = value
            }
        }
}

fun main() {
    val planeta = Planeta("Terra")
    planeta.tamanho = 2000
    println("Tamanho do planeta: ${planeta.tamanho}")
    println("Nome do planeta: ${planeta.nome}")

    println("")

    val planeta2 = Planeta2()
    planeta2.nome = ""
    println(planeta2.nome)
    planeta2.nome = "Jupiter"
    println("Nome do planeta: ${planeta2.nome}")
}