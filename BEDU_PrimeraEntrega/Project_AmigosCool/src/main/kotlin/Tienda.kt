class Tienda {

    fun verProducts() {
        do {
            println("******************************")
            println("¿Que artículo deseas ver?")
            println("1) Playeras")
            println("2) Stickers")
            println("3) Sudaderas")
            println("4) Juegos")
            val opc = readLine()!!.toInt()

            when (opc) {
                1 -> imprPlay()
                2 -> imprStickers()
                3 -> imprSudadera()
                4 -> imprJuegos()
                //5 -> main()
                else -> println("Opcion Invalida")
            }
            println("¿Buscar otro producto S/N ?")
            var cont = readLine()!!.toString()
        }while (cont == "S")

    }

    private fun imprPlay() {
        val nombres = listOf(
            "Making waves",
            "Al Blue",
            "Barb cool",
            "Be happy",
            "Frog"
        )
        println("Playeras en existencia: ")
        nombres.forEach { println(it) }
    }

    private fun imprStickers() {
        val nombres = listOf(
            "Wong",
            "Punk",
            "Making waves",
            "X Huess gold",
            "Barb"
        )
        println("Stickers en existencia: ")
        nombres.forEach { println(it) }
    }

    private fun imprSudadera() {
        val nombres = listOf(
            "Hoodie Blue"
        )
        println("Sudadera en existencia: ")
        nombres.forEach { println(it) }
    }

    private fun imprJuegos() {
        val nombres = listOf(
            "Yo nunk nunk",
            "Agua de charco"
        )
        println("Juegos en existencia: ")
        nombres.forEach { println(it) }
    }
}