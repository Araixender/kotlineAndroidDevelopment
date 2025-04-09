fun greetingsFunction(greeting: String, vararg listOfItems: String) {
    listOfItems.forEach{item ->
        println("$greeting, $item")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting, $name")

fun main() {
    var programmingLanguages = arrayOf("Kotlin", "Java", "Python", "JavaScript")
    greetingsFunction("Hi", *programmingLanguages)
    greetPerson(greeting = "Hello", name = "Alexender")
    greetPerson()

    
}