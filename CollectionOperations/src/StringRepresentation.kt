fun main() {
    println("String Representation")
    val numbersString = listOf("one", "two", "three", "four")
    println(numbersString)
    println(numbersString.joinToString())

    println("String Buffer")
    val listString = StringBuffer("The list of Numbers: ")
    println(numbersString.joinTo(listString))

    println(numbersString.joinToString(separator = " | ", prefix = "Start: ", postfix = ": end"))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "<<.."))
    println(numbersString.joinToString { "Elements: ${it.uppercase()}" })
}

