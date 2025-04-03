fun main() {
    val numbers = setOf(1, 2, 3, 4, 5)

    // Mapping collection Transformation.
    println(numbers.map{
        if(it == 4){
            it * 512
        }else{
            it * 1096
        }
    })

    val numberMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 4" to 4)

    println(numberMap.mapKeys {
        it.key.uppercase()
    })

    println(numberMap.mapKeys {
        it.value + it.key.length
    })

    println(numbers.mapIndexedNotNull{index, value ->
        if (index == 0) null
        else index * value
    })

    // zipping
    val colors = listOf("red", "Brown", "Grey")
    val animals = listOf<String> ("fox", "bear", "wolf")

    println(colors.zip(animals))
    println(colors zip animals)

    println(colors.zip(animals){color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})


    // Unzipping
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3)
    println(numberPairs)
    println(numberPairs.unzip())
    println(numberPairs.unzip().first[0])

    // 

}