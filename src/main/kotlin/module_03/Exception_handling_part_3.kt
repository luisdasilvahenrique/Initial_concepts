import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() {
    readingFile()
}

fun readingFile(){
    var arquivo = File("C:\\Users\\Administrador\\Documents\\Introdução ao desenvolvimento android\\Initial_concepts\\src\\main\\kotlin\\module_03\\passo a passo.txt")
    try {
        Scanner(arquivo).use {l ->
            l.useDelimiter("\\A")
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("Arquivo não encontrado " + e.message)
    }
}