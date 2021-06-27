fun main(){
    val tienda = Tienda()
    val cliente = Cliente()
    val comprar = Comprar()

    do {
        println("VENTANA PRINCIPAL AMIGOS COOL")
        println("******************************")
        println("1) Ver Articulos")
        println("2) Comprar")
        println("3) Registrarse")
        println("4) Ingresar a la plataforma")
        println("5) Salir")
        println("******************************")
        println("Ingresa la opcion desea: ")
        var opc = readLine()!!.toInt()

        when (opc) {
            1 -> tienda.verProducts()
            2 -> comprar.comProduct()
            3 -> cliente.registerUser()
            4 -> cliente.loginUser()
            5 -> "N"
            else -> println("Opcion Invalida")
        }
        println("Regresar al menu?: (S/N)")
        var cont = readLine()!!.toString()
    }while (cont == "S")
}