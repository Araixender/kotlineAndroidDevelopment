// for variable
var a:Int? = null
var b: String? = null
// for constant
var greeatings: String? = null

val constantea: String = "Sting"

fun main() {
    greeatings = "Hello World"
    println("Hello World!")

//    val greetingToPrint = if(greeatings != null) greeatings else "I'm Greeting to Print "

    val greetingToPrint: String? = when(greeatings) {
        null -> "Great"
        else -> greeatings
    }
    print(greetingToPrint)
    if (b != null) {
        println("Hello Something")
    } else{
        println("Hi")
    }

    when(greeatings) {
        null -> println("I'm null")
        else -> println(greeatings)

    }



    a = 1
    print(a)
    println(b)
}

