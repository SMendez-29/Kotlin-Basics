package Dev.Smendez.smendezfirsttest.sintaxis

fun main(){

    //val Sofia = Usuario (name:"Sofia",age:31,email:"mendezsofia29@gmail.com",DNI:"DNI37791346")

    val Sofia = Usuario(
        name = "Sofia",
        age = 31,
        email = "sofia29@gmail.com",
        DNI = "37791346")


    println(Sofia.name)
    println(Sofia.age)
    //println(Sofia.email)
    //println(Sofia.DNI)
    Sofia.getEmail(role = "admin")
    Sofia.getDNI(role = "user") //no me deberia traer el DNI


    val Paula = Usuario(
        name = "Paula",
        age = 32,
        email = "Paula30@gmail.com",
        DNI = "37791576")

    val Georgina = Usuario(
        name = "Georgina",
        age = 30,
        email = "Geor29@gmail.com",
        DNI = "37791897")

    Sofia.addFriend(Paula)
    Paula.addFriend(Georgina)
    Georgina.addFriend(Paula)
    Paula.addFriend(Sofia)

    Sofia.getFriends()
    Paula.getFriends()
    Georgina.getFriends()

}