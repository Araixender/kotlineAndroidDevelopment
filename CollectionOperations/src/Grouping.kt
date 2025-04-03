fun main () {
    println("Grouping ...")
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.last() })
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
}

