/*
* Companion Objects
* Object Declaration
*
* */


object EntityFactory {
    fun create() = EntityFactoryClasso("id", "Hello world")
}

/*
interface IdProvider {
    fun getId(): String {
        return "hello world"
    }
}
*/


class EntityFactoryClasso (val id: String, val name: String) {


    /*
    companion object Factory{
        override fun getId(): String {
            return "xldkjflduroru"
        }
        fun create() = entityFactory("22")
    }


     */

    override fun toString(): String {
        return "id: $id and name: $name"
    }

}


fun main() {
    val entity = EntityFactory.create()
    println(entity)
}