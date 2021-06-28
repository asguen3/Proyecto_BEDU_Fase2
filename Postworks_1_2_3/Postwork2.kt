package Postwork

fun main(){
    println("Ingrese el nombre del modelo de playera: ")
    var nomPlay = readLine().toString()
    var nPlay = nomPlay
    println("En existencia ${buscarPlayera(nPlay)} pieza(s) del modelo $nomPlay")

}

fun buscarPlayera(name: String): Int {
    val modelos = listOf(
        "Making waves",
        "Al Blue",
        "Barb cool",
        "Be happy",
        "Frog",
        "Making waves"
    )

    var cont = 0
    for (modelo in modelos) {
        if (name in modelo) {
            cont++
        }
    }
    return cont
}
