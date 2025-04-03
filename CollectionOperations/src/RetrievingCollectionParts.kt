fun main() {
    println("Retrieve Collection Parts")
    val numbers = listOf("One", "Two", "Three", "Four", "Five", "Six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3, 5, 0)))
    println()
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println()
    println(numbers.drop(1))
    println(numbers.dropLast(5))
    println()
    println(numbers.takeWhile { !it.startsWith("F") })
    println(numbers.takeLastWhile { it != "Three" })

}