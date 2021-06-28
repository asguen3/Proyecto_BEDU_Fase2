package Postwork

fun main(){
    val precioPlayera = 210
    val precioSudadera = 250
    val precioSticker = 55
    val precioJuego = 150

    println(" Lista de precios")
    println("\" Playera $ $precioPlayera \", \n"+
            "\" Sticker $ $precioSticker \", \n"+
            "\"Sudadera $ $precioSudadera\", \n"+
            "\"Juego    $ $precioJuego\"")

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
    println("Ingrese usuario: ")
    val name = readLine()!!.toString()

    println("Ingrese contraseña: ")
    val password = readLine()!!.toString()

    println("Validando...")
    var session = false
    if (name != "" && password != ""){
        println("Bienvenido")
        session = true
    }else if (name == "" && password != ""){
        println("Nombre invalido.")
        session = false
    }else if (name != "" && password == ""){
        println("Contraseña invalida.")
        session = false
    }else{
        println("Usuario y/o Contraseña invalido(s).")
    }
}