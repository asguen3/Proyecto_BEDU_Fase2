class Paquetes {

    fun paquetes() {
        val precioPlayera = 210
        val precioSudadera = 250
        val precioSticker = 55
        val precioJuego = 150

        println("*************************************************************")
        println("Paquete 1: Playera + Sticker")
        val playStic = precioPlayera + precioSticker
        println("$ $playStic")

        println("Paquete 2: Sudadera + Juego")
        val sudaJueg = precioSudadera + precioJuego
        println("$ $sudaJueg")

        println("Paquete 3: Sticker + Juego")
        val stickJug = precioJuego + precioSticker
        println("$ $stickJug")

        println("Paquete 4: Playera + Sudadera")
        val playSuda = precioSudadera + precioPlayera
        println("$ $playSuda")

        println("Paquete 5: Super Combo (Playera + Sudadera + Sticker + Juego)")
        val comboPrec = precioSudadera + precioPlayera + precioSticker + precioJuego
        println("$ $comboPrec")
        println("*************************************************************************************************")

        println("¿Te gustó algo?")
        val respuestapaquetes = readLine().toString()
        when {
            respuestapaquetes == "si" -> {
                println("¿Que esperas? Elige tu paquete :D")
                var elegirpaquetes = readLine()!!.toInt()
                val compraP = compraPaquetes()
                when (elegirpaquetes) {
                    1 -> println("$compraP\n" +
                        "Elegiste el paquete 1\n" +
                            "Total a pagar: $$playStic MX\n")

                    2 -> println("Elegiste el paquete 2\n" +
                            "Total a pagar: $$sudaJueg MX\n" +
                            "${compraPaquetes()}")
                    3 -> println("Elegiste el paquete 3\n" +
                            "Total a pagar: $$stickJug MX\n" +
                            "${compraPaquetes()}")
                    4 -> println("Elegiste el paquete 4\n" +
                            "Total a pagar: $$playSuda MX\n" +
                            "${compraPaquetes()}")
                    5 -> println("Elegiste el paquete 5\n" +
                            "Total a pagar: $$comboPrec MX\n" +
                            "${compraPaquetes()}")
                    else -> println("Opcion Invalida")

                }

            }
            else ->
                respuestapaquetes == "no"
        }

           /* when (elegirpaquetes) {
                1 -> println(
                    "Elegiste el paquete 1\n" +
                            "Total a pagar: $$playStic MX" +
                            "${compraPaquetes()}"
                )

                2 -> println(
                    "Elegiste el paquete 2\n" +
                            "Total a pagar: $$sudaJueg MX"
                )

                3 -> println(
                    "Elegiste el paquete 3\n" +
                            "Total a pagar: $$stickJug MX"
                )

                4 -> println(
                    "Elegiste el paquete 4\n" +
                            "Total a pagar: $$playSuda MX"
                )

                5 -> println(
                    "Elegiste el paquete 5\n" +
                            "Total a pagar: $$comboPrec MX"
                )

                else -> println("Opcion Invalida")
            }
*/



        }
    }

