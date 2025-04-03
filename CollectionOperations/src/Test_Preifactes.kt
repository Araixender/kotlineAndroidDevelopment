fun main() {
    println("Test Prefaces")
    val numbers = listOf("one", "two", "Three", "Four")
    println(numbers.any{it.endsWith("e")})
    println(numbers.none{it.endsWith('w')})
    println(numbers.all{it.length > 1})
}