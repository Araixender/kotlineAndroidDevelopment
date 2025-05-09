// Association Tranformation.
fun main() {
    val numbers = listOf("one", "two", "Three", "Four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
}