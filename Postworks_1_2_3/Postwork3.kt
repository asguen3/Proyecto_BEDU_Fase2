package Postwork

const val CARD_LENGTH = 16

fun main(){
    var post3 = Postwork3(" Esteban ", 18, "estebancorreo@email.com")
    println("Datos del Cliente")
    println("Nombre: "+post3.name)
    println("Edad: "+post3.age)
    println("Email: "+post3.email)
    println("**Registro de Tarjeta**")
    println("Ingrese su #Tarjeta: ")
    val numCard: Long = readLine()!!.toLong()

    val validacion = post3.cardRegister(numCard)
    //println("Tarjeta Valida? $validacion")
    println("Validando...")
    if (validacion == true)
    {
        println("Registro de Tarjeta Exitoso")
    }else{
        println("Registro Rechazado")
    }
}

class Postwork3 (val name: String,
                 var age: Int,
                 val email: String)
{
    fun cardRegister(numCta: Long): Boolean {
        fun validar(card: Long): Boolean{
          if (card.toString().length == CARD_LENGTH) {
                    return true
          } else if(card.toString().length > CARD_LENGTH || card.toString().length < CARD_LENGTH){
              return false
          }else {
              return false
          }
        }
        val cardValidate = validar(numCta)
        return cardValidate
    }
}
