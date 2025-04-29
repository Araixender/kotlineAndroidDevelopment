class Functional {
}

fun main () {
    val listOfLanguage = listOf("Kotlin", "Java", "Python", "Ruby", null, null)
//    listOfLanguage
//        .filterNotNull()
//        .filter{ it.startsWith("K")}
//        .map{
//            it.length
//        }
//        .forEach{
//        println(it)
//    }
    listOfLanguage
        .filterNotNull()
        .takeLast(3)

        .forEach{
            println(it)
        }
}