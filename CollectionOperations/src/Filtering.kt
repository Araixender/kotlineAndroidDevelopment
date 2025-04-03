fun main() {
    println("Filtering...")
    val numbers = listOf("one", "two", "three", "four")

    val longerThan3 = numbers.filter {
        it.length > 3
    }
    println(longerThan3)

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 101" to 101)

    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }

    println(filteredMap)

    val filteredIndex = numbers.filterIndexed {index, value -> (index != 0) && (value.length < 5) }

    val filterNot = numbers.filterNot { it.length <= 3 }

    println(filteredIndex)

    println(filterNot)

    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "HELLO WORLD", false, true)

    mixedList.filterIsInstance<Char>().forEach{
        println(it)
    }

    println("Partitions")
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
}