import java.util.*


enum class DataClassesType {
    HELP, EASY, MEDIUM, HARK;

    fun getFormattedName () = name.lowercase(Locale.getDefault()).capitalize()
}


object DataClassessObj {
    fun create(type: DataClassesType): DataClass {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            DataClassesType.EASY -> type.name
            DataClassesType.MEDIUM -> type.getFormattedName()
            DataClassesType.HARK -> "Hard"
            DataClassesType.HELP -> type.getFormattedName()
        }
        return when(type){
            DataClassesType.EASY -> DataClass.Easy(id, name)
            DataClassesType.MEDIUM -> DataClass.Medium(id, name)
            DataClassesType.HARK -> DataClass.Hard(id, name, multiplier = 2f)
            DataClassesType.HELP -> DataClass.help
        }
    }
}


sealed class DataClass () {
    object help: DataClass() {
        val name = "help"
    }
    data class Easy(val id:String, val name: String): DataClass()
    data class Medium(val id:String, val name: String): DataClass()
    data class Hard(val id:String, val name: String, val multiplier: Float): DataClass()

}


fun main() {
    val entity1: DataClass = DataClassessObj.create(DataClassesType.EASY)
    val entity2: DataClass = DataClassessObj.create(DataClassesType.EASY)

    if(entity1 == entity2){
        println("They are the same")
    }else {
        println("They are not same")
    }

}