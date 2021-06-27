class Cliente {

    fun loginUser() {
        var session = false
        println("Ingrese su usuario y contraseña: ")
        val name = readLine()!!.toString()
        val pass = readLine()!!.toString()
        when {
            name != "" && pass != "" -> {
                println("Bienvenido")
                session = true
            }
            name == "" && pass != "" -> {
                println("Nombre invalido.")
                session = false
            }
            name != "" && pass == "" -> {
                println("Contraseña invalida.")
                session = false
            }
            else -> {
                println("Usuario y/o Contraseña invalido(s).")
            }
        }
    }

    fun registerUser() {
        println("Ingrese la siguiente informacion: ")
        println("Nombre de Usuario: ")
        val userName: String = readLine()!!.toString()
        println("Contraseña: ")
        val userPass: Long = readLine()!!.toLong()

        if (userName != null && userPass != null) {
            println("Registro Exitoso")
            println(userName)
            println(userPass)
        } else if (userName == null || userPass == null) {
            println("Usuario y/o Contraseña no validos. No se realizo ningun registro")
        }
    }
}
