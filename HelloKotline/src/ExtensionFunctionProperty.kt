
sealed class Entity() {
    object Help : Entity() {
        val name = "HELP"
    }

    data class Easy (val id: String, val name : String) : Entity()
    data class Medium (val id: String, val name : String) : Entity()
    data class Hard (val id: String, val name : String) : Entity()
}

fun Entity.Easy.printInfoSection() {
    println("Medium class $id")
}

fun DataClass.Medium.printInfosection() {
    println("Medium class $id")
}

val DataClass.Medium.info: String
    get() = "Humansiztion"

class ExtensionFunctionProperty {
}


fun main() {

    val en2 = Entity.Easy("id", "Hello world")
    val en1 = DataClassessObj.create(DataClassesType.MEDIUM)

    if (en1 is DataClass.Medium) {
        en1.printInfosection()
        en1.info
    }
    println("Hello world")
}