package module_02
fun main() {
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        print("$i ")
    }
    print(" ")
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        print("$i ")
    }
    print(" ")
    val str = "Teste de loop"
    for (c in 0 .. (str.length - 1)){
        if(str[c] == 'T' || str[c] == 'l'){
            continue
        }
        print(str[c])
    }
}