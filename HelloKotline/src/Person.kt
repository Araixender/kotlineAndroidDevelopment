/*

class Person(_firstName: String, _lastName: String) {
    val firstName: String
    val lastName: String = _lastName
    // both are same
    init{
        firstName = _firstName
    }
}


 */

/*

class Person (val firstName: String, val lastName: String){
    init {
        println("init 1")
    }


// secondary constructor
    constructor(): this("Peter", "Parker") {
        println("Secondary Constructor")
    }

    init {
        println("init 2")
    }
}


 */


class Person (var firstName: String = "Peter", var lastName: String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("The Returned Value is $field")
            return field
        }
}