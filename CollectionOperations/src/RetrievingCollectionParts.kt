fun main() {
    println("Retrieve Collection Parts")
    val numbers = listOf("One", "Two", "Three", "Four", "Five", "Six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3, 5, 0)))

}