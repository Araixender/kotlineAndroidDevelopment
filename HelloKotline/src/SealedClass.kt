//import java.util.*
//
//
//enum class SealedClassType {
//    HELP, EASY, MEDIUM, HARK;
//
//    fun getFormattedName () = name.lowercase(Locale.getDefault()).capitalize()
//}
//
//
//object SealedClassObj {
//    fun create(type: DataClassesType): DataClass {
//        val id = UUID.randomUUID().toString()
//        val name = when(type) {
//            DataClassesType.EASY -> type.name
//            DataClassesType.MEDIUM -> type.getFormattedName()
//            DataClassesType.HARK -> "Hard"
//            DataClassesType.HELP -> type.getFormattedName()
//        }
//        return when(type){
//            DataClassesType.EASY -> DataClass.Easy(id, name)
//            DataClassesType.MEDIUM -> DataClass.Medium(id, name)
//            DataClassesType.HARK -> DataClass.Hard(id, name, multiplier = 2f)
//            DataClassesType.HELP -> DataClass.help
//        }
//    }
//}
//
//
//sealed class SealedClass () {
//    object help: SealedClass() {
//        val name = "help"
//    }
//    data class Easy(val id:String, val name: String): DataClass()
//    data class Medium(val id:String, val name: String): DataClass()
//    data class Hard(val id:String, val name: String, val multiplier: Float): DataClass()
//
//}
//
//
//fun main() {
//   val entity: DataClass = SealedClassObj.create(SealedClassType.EASY)
//    val msg = when(entity) {
//        is SealedClass.Easy -> "Easy Class"
//        is SealedClass.Hard -> "Hard Class"
//        is SealedClass.Medium -> "Medium Class"
//        SealedClass.help -> "Help Class"
//    }
//    println(msg)
//}