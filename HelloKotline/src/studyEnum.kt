/*
* Sealed Classes
* */


import java.util.*


enum class StudyType {
    EASY, MEDIUM, HARK;

    fun getFormattedName () = name.lowercase(Locale.getDefault()).capitalize()
}


object StudyEnum {
    fun create(type: StudyType): StudyEnumClass {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            StudyType.EASY -> type.name
            StudyType.MEDIUM -> type.getFormattedName()
            StudyType.HARK -> "Hard"
        }
        return StudyEnumClass(id=id, name = name)
    }
}


class StudyEnumClass (val id: String, val name: String) {

    override fun toString(): String {
        return "id: $id and name: $name"
    }

}


fun main() {
    val entity = StudyEnum.create(StudyType.EASY)
    println(entity)

    val entity2 = StudyEnum.create(StudyType.MEDIUM)
    println(entity2)
}