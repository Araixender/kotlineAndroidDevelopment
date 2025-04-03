/*

fun main(args: Array<String>){

    // Immutable list;
    val names = listOf<String>("Name1", "Name2", "Name3")
    // Mutable list
    val names = mutableListOf("Name1", "Name2", "Name3")
    names.removeAt(2)
    names.remove("Name1")
    names.add("Name 4")
    names.forEach {
        println(it)
    }
}
*/

//
//fun main (args: Array<String>) {
//
//}


/*
fun main (args: Array<String>) {

    // you cannot get multiple items in to the list.
    val names = setOf<String>("Name 1", "Name 2", "Name 3", "Name 4", "Name 1")

    names.forEach{
        println(it)
    }
}

 */


/*

fun main (args: Array<String>) {
    val names = mutableSetOf<String>("Name 1","Name 1" , "Name 2", "Name 3", "Name 4", "Name 5")
    names.add("Names 6")

    names.forEach{
        println(it)
    }
}
*/
/*
fun main (args: Array<String>) {
    val user1 = Usr("Human Name 1")
    val user2 = Usr("Human Name 2")
    val user3 = Usr("Human Name 3")
    val user4 = Usr("Human Name 3")
    val user5 = Usr("Human Name 5")
    val user6 = Usr("Araixender")


    val names = mutableSetOf<Usr>(user1, user2, user3, user3, user4, user5, user6)

    names.forEach{
        println(it.name)
    }
}


data class Usr(val name: String)
*/



/*
fun main (args: Array<String>) {
    val users = mapOf<Int, String>(1 to "Maria", 2 to "Alexander", 3 to "Araixander")

    println(users[1])
}
*/



fun main (args: Array<String>) {
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alexander", 3 to "Araixander")
    users[4] = "Injir"
    users.remove(2)
    users.forEach { t, u ->
        println("$t and $u")
    }

//    println(users[1])
}


