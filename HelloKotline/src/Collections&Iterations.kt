
fun greetings(greet: String, itemsToGreets: List<String>) {
    itemsToGreets.forEach{item ->
        println("$greet $item")
    }
}

fun main() {
    // arrays
    val interestingThings = arrayOf("Kotlin", "Java", "Python", "JavaScript")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for (interestingThing in interestingThings){
        println("I love you $interestingThing !")
    }

    interestingThings.forEach{ interstingItem ->
        println(interstingItem)
    }

    interestingThings.forEachIndexed{index, s ->
        println(index)
        println(s)
    }

    // lists
    val interestingFruits = listOf("Mango", "Banana", "Graphs", "Peach")

    for (interestingThing in interestingFruits){
        println("I love you $interestingThing !")
    }

    interestingFruits.forEach{ interstingItem ->
        println(interstingItem)
    }

    interestingFruits.forEachIndexed{index, s ->
        println(index)
        println(s)
    }


    // map -> are like objects
    val mapThings = mapOf(1 to "Biryani", 2 to "Pasta", 3 to "Spigatti")
    mapThings.forEach {r, u ->
        println("$u at $r")
    }

    // Mutable List of Interesting Things
    val mutableListInterestingThing = mutableListOf("Kotlin", "Java", "Python", "Javascript")
    mutableListInterestingThing.add("Rust")
    println(mutableListInterestingThing)
 // Mutable List of Interesting Things
    val mutableThingsOfMap = mutableMapOf(1 to "Biryani", 2 to "Pasta", 3 to "Spigatti")
    mutableThingsOfMap.put(4 , "Kabab")
    mutableThingsOfMap[5] = "Spicy"
    println(mutableThingsOfMap)

    val listOfGreetingsFunction = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    greetings("hello", listOfGreetingsFunction)
}