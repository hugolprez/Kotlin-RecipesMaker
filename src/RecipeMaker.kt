
fun main(args: Array<String>) {
    var exitProgram: Boolean = false

    loop@ do {
        val recipesMenu = """
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()

        println(recipesMenu)

        val strResponse: String? = readLine()

        val intResponse: Int = strResponse?.toIntOrNull() ?: 0

        when (intResponse) {
            1, 2 -> println("El usuario seleccionó: $intResponse")
            3 -> {
                exitProgram = true
                println("Programa Finalizado!")
                continue@loop
            }
            else -> println("Ingrese unicamente entre 1 y 3.")
        }

    } while (exitProgram.equals(false))
}