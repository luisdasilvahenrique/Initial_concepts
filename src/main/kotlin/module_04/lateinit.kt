class Robo{
    lateinit var name: String
    fun on() {
        name = "Iniciando robô"
    }

    fun lateinit() {
        if (!this::name.isInitialized) {
            name = "Inicializando robô"
            println(name)
        }
    }
}
fun main() {
    val bot: Robo = Robo()
    //println(bot.on())
    bot.lateinit()
    println(bot.name)
}