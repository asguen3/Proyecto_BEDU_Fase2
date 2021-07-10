fun compraPaquetes() {

    val tutarjeta = "Tarjeta"
    val transferecia = "Transferencia"
    val tarjetaP = "Puntos"
    val tarjeta = 5000f
    val puntos = "La cantidad de puntos que puede abonar son $50, $100 y $500"

    val precioPlayera = 210
    val precioSudadera = 250
    val precioSticker = 55
    val precioJuego = 150

    val playStic = precioPlayera + precioSticker
    val sudaJueg = precioSudadera + precioJuego
    val stickJug = precioJuego + precioSticker
    val playSuda = precioSudadera + precioPlayera
    val comboPrec = precioSudadera + precioPlayera + precioSticker + precioJuego


    println("¿Quieres proceder con el pago?")

    val respuesta = readLine().toString()

    when {
        respuesta == "si" -> {
            println("Los métodos de pago son:")
            println(tutarjeta)
            println(transferecia)
            println(tarjetaP)
            println("Elige el método de pago")

            val pago = readLine().toString()

            if (pago == "Tarjeta") {
                println("Elegiste pago con tarjeta")
                if (comboPrec >= tarjeta || playStic >= tarjeta || sudaJueg >= tarjeta || stickJug >= tarjeta || playSuda >= tarjeta) {
                    println("Su saldo es insuficiente y no se puede completar el pago :c")
                } else if (comboPrec <= tarjeta || playStic <= tarjeta || sudaJueg <= tarjeta || stickJug <= tarjeta || playSuda <= tarjeta) {
                    println("Su saldo es suficiente, !Compra exitosa! :D")
                }

            } else if (pago == "Transferencia") {
                println(
                    "Los datos para realizar la transferencia son:\n" +
                            "Banco: BBVA\n" +
                            "Número de cuenta: 123456789034578321\n" +
                            "Referecia: 612348\n" +
                            "Monto a pagar: $${comboPrec == comboPrec || playStic == playStic || sudaJueg == sudaJueg || stickJug == stickJug || playSuda == playSuda} MX"
                )

            } else if (pago == "Puntos") {
                println("Elegiste pago con puntos Amigos cool")
                if (comboPrec >= tarjeta) {
                    println("Sus puntos son insuficientes.¿Desea agregar más puntos?")
                    val respuestaP = readLine().toString()
                    if (respuestaP == "si") {
                        println(puntos)
                        println("Escriba la cantidad de puntos que quiera abonar:")
                        val agregarP = readLine()?.toInt()
                        if (agregarP == 50) {
                            println("Tenías $tarjeta puntos, ahora tienes ${tarjeta + 50}")
                            println("Total a pagar: $comboPrec")
                            println("El pago se ha realizado automaticamente")
                            println("Puntos actuales: ${tarjeta + 50 - comboPrec}")
                            println("Gracias por tu compra :D")
                        } else if (agregarP == 100) {
                            println("Tenías $tarjeta puntos, ahora tienes ${tarjeta + 100}")
                            println("Total a pagar: $comboPrec")
                            println("El pago se ha realizado automaticamente")
                            println("Puntos actuales: ${tarjeta + 100 - comboPrec}")
                            println("Gracias por tu compra :D")
                        } else if (agregarP == 500) {
                            println("Tenías $tarjeta puntos, ahora tienes ${tarjeta + 500}")
                            println("Total a pagar: $comboPrec")
                            println("El pago se ha realizado automaticamente")
                            println("Puntos actuales: ${tarjeta + 500 - comboPrec}")
                            println("Gracias por tu compra :D")
                        } else {
                            println("No se puede abonar esa cantidad en puntos, por favor elija una cantidad válida")
                        }
                    } else {
                        println("¿Deseas seguir comprando?")
                        val seguircomprando = readLine().toString()
                        if (seguircomprando == "si") {
                            main()
                        }
                    }
                } else if (comboPrec <= tarjeta) {
                    println("Su saldo es suficiente, !Compra exitosa! :D")
                }

            } else if (pago != "Tarjeta" || pago != "Transferencia" || pago != "Puntos") {
                println("Ingrese un método de pago válido")

            }
        }
        else -> {
            println("¿Deseas seguir comprando?")
            val seguircomprando = readLine().toString()
            if (seguircomprando == "si") {
                main()
            } else if (seguircomprando == "no") {
            }
        }
    }
}