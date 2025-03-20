package Dev.Smendez.smendezfirsttest.sintaxis

fun main (){

    val friends = listOf("Geor", "Sol", "Pau")
    val ages = listOf(28, 30, 31)
/*
    println(friends)
    println(friends [0])
    println(ages)
    println(ages [0])
*/
    println(friends.first())
    println(ages.last())
    println(friends.size)

    //GET
    //println(friends[0])
    //println(friends.get(0))

    //SET
    //friends.set (0, "Agus") / No se puede editar una lista

    val newFriends = mutableListOf("Geor", "Sol", "Pau")

    newFriends.set(0,"Agus")
    println(newFriends[0])

    newFriends.add("Fer")
    println(newFriends)

}