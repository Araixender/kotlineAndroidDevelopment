// Flattern Function.

fun main () {
    // multi - dimentional array .
    val numberSets = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println(numberSets[2][2])

    val numberSetsList = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))

    for (numbers in numberSetsList) {
         for (num in numbers) {
             print(num)
         }
        print('\n')
    }
    // converting multi - dimentional array in to one dimentional array.
    val numberFlatten = numberSetsList.flatten()
    println(numberFlatten[8])


    // loop through one dimentional array.
    for (number in numberFlatten) {
        print(number)
    }
}
