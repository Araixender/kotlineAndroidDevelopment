fun printFiltereedString(listo:List<String>, perdicate: ((String) -> Boolean)?) {
    listo.forEach {
        if (perdicate?.invoke(it) == true) {
            println(it)
        }
    }
}


val predicate3: (String) -> Boolean = {
    it.startsWith("J")
}

fun getPredicate(): (String) -> Boolean {
    return {
        it.startsWith("J")
    }
}

fun main () {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript", "Python")
    printFiltereedString(list, getPredicate())
//    printFiltereedString(list, null)
}