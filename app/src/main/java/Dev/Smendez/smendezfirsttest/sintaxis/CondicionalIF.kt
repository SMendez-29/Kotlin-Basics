package Dev.Smendez.smendezfirsttest.sintaxis

fun main (){

    val name = "Sofia Mendez"
    val role = "admin"
    val age = 31

    if (age>50){
        println("$name es un adulto mayor")
    } else if (age>30){
        println("$name es un adulto")
    } else if (age>18){
        println("$name es un adulto joven")
    } else{
        println("$name es menor de edad")
    }

    //Cualquier valor que no este conciderado en los else if, ingresara solo en el else

    if (role == "name"){
        println("Tiene acceso a tu perfil")
    }

    if (role == "admin"){
        println("Tiene acceso a todos los contenidos")
    }

    if (role == "guest"){
        println("solo anda viendo")
    }

    //El if solo no es excluyente, el else if si es excluyente
    //el primer else if que se encuentre, evita que siga al siguente else if
}