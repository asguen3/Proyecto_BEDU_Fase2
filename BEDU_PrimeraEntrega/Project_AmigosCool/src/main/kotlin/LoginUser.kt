class LoginUser {

    val users = arrayListOf(User("jazmin.icss@gmail.com", "123456"))

    fun registerUser(){
        println("Ingresa Correo electronico")
        val email = readLine()!!.toString()
        println("Ingresa Contraseña")
        val password = readLine()!!.toString()

        users.add(User(email,password))
        println(users)
    }

    fun loginUser(){

    }




}