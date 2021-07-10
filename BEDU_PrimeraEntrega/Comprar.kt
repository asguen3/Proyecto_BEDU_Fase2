open class Comprar () {
    var subToPlay: Float = 0f


    fun comProduct() {
        println("COMPRAR...")
        println("******************************")
        println("¿Que deseas comprar?")
        println("1) Playeras")
        println("2) Stickers")
        println("3) Sudaderas")
        println("4) Juegos")
        println("5) Regresar al Menu")
        val opc = readLine()!!.toInt()

        when (opc) {
            1 -> comprarPlay()
            2 -> comprarStic()
            3 -> comprarSud()
            4 -> comprarJue()
            5 -> main()
            else -> println("Opcion Invalida")
        }
    }


    open fun comprarPlay() {
        var i = 1
        println("Ingresa la cantidad de playeras a comprar")
        val cantidad = readLine()!!.toInt()

        //var subToPlay: Float = 0f
        var precio: Int = 0

        while (i <= cantidad) {
            println("Ingrese el color de playera $i - B si Blanca y N si es Negra")
            val color = readLine()
            println("Ingresa la Talla de la playera ya sea CH, MD, GD o XL")
            val talla = readLine()

            var result = when (talla) {
                "CH" -> if (color == "B") {
                    println("El color de la playera : $color la talla  : $talla  precio $ =${210}")
                    precio = 210
                } else {
                    println("El color de la playera : $color la talla  : $talla  precio $ ${240}")
                    precio = 240
                }

                "MD" -> if (color == "B") {
                    println("El color de la playera : $color la talla  : $talla  precio $ =${230}")
                    precio = 230
                } else {
                    println("El color de la playera : $color la talla  : $talla  precio $ ${260}")
                    precio = 260
                }

                "GD" -> if (color == "B") {
                    println("El color de la playera : $color la talla  : $talla  precio $ =${250}")
                    precio = 250
                } else {
                    println("El color de la playera : $color la talla  : $talla  precio $ ${280}")
                    precio = 280
                }

                "XL" -> if (color == "B") {
                    println("El color de la playera : $color la talla  : $talla  precio $ =${290}")
                    precio = 290
                } else {
                    println("El color de la playera : $color la talla  : $talla  precio $ ${320}")
                    precio = 320
                }
                else -> "Talla No disponible"
            }
            subToPlay = precio + subToPlay
            i++
        }

        println("El total de su compra es $ $subToPlay")
        val cobro = Carrito()
        cobro.cobro()

    }


    fun comprarStic() {
        var i = 1
        println("¿Cuantos Strickers quieres comprar?")
        val cantidad = readLine()!!.toInt()

        //var subToPlay: Int = 0
        var precio: Int = 0

        while (i <= cantidad) {
            println("Ingrese Diseño del Stricker")
            println(
                "\"Wong -> W\",\n" +
                        "\"Punk -> P\",\n" +
                        "\"Making waves -> Mw\",\n" +
                        "\"X Huess gold -> XHg\",\n" +
                        "\"Barb -> B\""
            )
            val diseño = readLine()

            when (diseño) {
                "W" -> {
                    precio = 50
                    println("Wong $ $precio")
                }

                "P" -> {
                    precio = 55
                    println("Punk $ $precio")
                }

                "Mw" -> {
                    precio = 75
                    println("Making waves $ $precio")
                }

                "XHg" -> {
                    precio = 85
                    println("X Huess gold $ $precio")

                }

                "B" -> {
                    precio = 95
                    println("Barb $ $precio")
                }
            }
            subToPlay = precio + subToPlay
            i++
        }
        println("El total de su compra es $ $subToPlay")
        val cobro = Carrito()
        cobro.cobro()

    }

    fun comprarSud() {
        var i = 1
        println("Modelo Único Disponible: Hoodie Blue")
        println("Cuantas Sudaderas deseas comprar: ")
        val cantidad = readLine()!!.toInt()

        //var subToPlay: Int = 0
        var precio: Int = 0

        while (i <= cantidad) {
            println("Ingresa la Talla de la $i sudadera CH, MD, GD o XL")
            val talla = readLine()

            when (talla) {
                "CH" -> {
                    precio = 250
                    println("Hoodie Blue Talla $talla Precio $ $precio")
                }

                "MD" -> {
                    precio = 280
                    println("Hoodie Blue. Talla $talla Precio $ $precio")
                }

                "GD" -> {
                    precio = 330
                    println("Hoodie Blue. Talla $talla Precio $ $precio")
                }

                "XL" -> {
                    precio = 380
                    println("Hoodie Blue. Talla $talla Precio $ $precio")
                }
                else -> "Talla No disponible"
            }
            subToPlay = precio + subToPlay
            i++
        }
        println("El total de su compra es $ $subToPlay")
        val cobro = Carrito()
        cobro.cobro()
    }

    fun comprarJue() {
        var i = 1
        println("¿Cuantos Juegos quieres comprar?")
        val cantidad = readLine()!!.toInt()

        //var subToPlay: Int = 0
        var precio: Int = 0

        while (i <= cantidad) {
            println("Ingrese el juego $i: ")
            println(
                "\" Yo nunk nunk -> NK \", \n" +
                        "\" Agua de charco -> AC\", \n"
            )
            val juego = readLine().toString()

            when (juego) {
                "NK" -> {
                    println("Juego: Yo nunk nunk")
                    precio = 150
                }

                "AC" -> {
                    println("Juego: Agua de charco")
                    precio = 150
                }
            }
            subToPlay = precio + subToPlay
            i++
        }
        println("El total de su compra es $ $subToPlay")
        val cobro = Carrito()
        cobro.cobro()

    }
}



