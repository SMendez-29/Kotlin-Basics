package Dev.Smendez.smendezfirsttest.sintaxis

fun main () {

    val name = "Sofia Mendez"
    val age = 31
    val role = "admin"

    when {

        age > 60 -> println("$name es un anciano")
        age > 30 -> println("$name es un adulto")
        age > 18 -> println("$name es un adulto joven")
        else -> println("$name es menor de edad")
    }

    when(role){

        "admin" -> println("Acceso Total")
        "user" -> println("Acceso Limitado")
        else -> println("Acceso Denegado")

    }




}