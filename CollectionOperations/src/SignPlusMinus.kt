fun main () {
    println("Sign Plus Minus Operators")
    val numbers = mutableListOf("One", "Two", "Three", "Four")
    numbers.add("Five")
    val plusList = numbers + "Six"
    println(plusList)

    val minusList = numbers - mutableListOf("Three", "Four")
    println(minusList)
}