open class Carrito {

    val tutarjeta = "Tarjeta"
    val transferecia = "Transferencia"
    val tarjetaP = "Puntos"
    open val tarjeta = 5000f
    val puntos = "La cantidad de puntos que puede abonar son $50, $100 y $500"

    open fun cobro() {
        var total = Comprar()
        println("¿Quieres proceder con el pago? ${total.subToPlay}")
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
                    if (total.subToPlay >= tarjeta) {
                        println("Su saldo es insuficiente y no se puede completar el pago :c")
                    } else if (total.subToPlay <= tarjeta) {
                        println("Su saldo es suficiente, !Compra exitosa! :D")
                    }

                } else if (pago == "Transferencia") {
                    println(
                        "Los datos para realizar la transferencia son:\n" +
                                "Banco: BBVA\n" +
                                "Número de cuenta: 123456789034578321\n" +
                                "Referecia: 612348\n" +
                                "Monto a pagar: $$total MX")

                } else if (pago == "Puntos") {
                    println("Elegiste pago con puntos Amigos cool")
                    if (total.subToPlay >= tarjeta) {
                        println("Sus puntos son insuficientes.¿Desea agregar más puntos?")
                        val respuestaP = readLine().toString()
                        if (respuestaP == "si") {
                            println(puntos)
                            println("Escriba la cantidad de puntos que quiera abonar:")
                            val agregarP = readLine()?.toInt()
                            if (agregarP == 50) {
                                println("Tenías $tarjeta puntos, ahora tienes ${tarjeta + 50}")
                                println("Total a pagar: $total")
                                println("El pago se ha realizado automaticamente")
                                println("Puntos actuales: ${tarjeta + 50 - total.subToPlay}")
                                println("Gracias por tu compra :D")
                            } else if (agregarP == 100) {
                                println("Tenías $tarjeta puntos, ahora tienes ${tarjeta + 100}")
                                println("Total a pagar: $total")
                                println("El pago se ha realizado automaticamente")
                                println("Puntos actuales: ${tarjeta + 100 - total.subToPlay}")
                                println("Gracias por tu compra :D")
                            } else if (agregarP == 500) {
                                println("Tenías $tarjeta puntos, ahora tienes ${tarjeta + 500}")
                                println("Total a pagar: $total")
                                println("El pago se ha realizado automaticamente")
                                println("Puntos actuales: ${tarjeta + 500 - total.subToPlay}")
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
                    } else if (total.subToPlay <= tarjeta) {
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
                } else if (seguircomprando == "no"){
                    println("¿Segur@ que no?")
                    println("podemos ofrecerte paquetes exclusivos que desearás comprar! :D")

                    val mostrarpaquetes = Paquetes()
                    mostrarpaquetes.paquetes()

                }
            }
        }
    }
}


