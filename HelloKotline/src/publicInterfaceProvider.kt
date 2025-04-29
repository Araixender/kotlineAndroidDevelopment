interface publicInterfaceProvider {
    val providerInfo: String
    fun printInfo (person: Person){
        print(providerInfo)
    }
}

interface sessionInfoProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider: publicInterfaceProvider, sessionInfoProvider {
    protected open val sessionIdPrefix = "Session ID"
    override val providerInfo: String
        get() = "Basic Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Addtional print Statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}
// object expression
fun main() {
//    val provider = BasicInfoProvider()
//    val provider = fancyInfoProvider()
    val provider = object: publicInterfaceProvider {
        override val providerInfo: String
            get() = "New Info Provider"
        fun getSessionId() = "id"
    }
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}

fun checkTypes(infoProvider: publicInterfaceProvider) {
    if (infoProvider !is sessionInfoProvider) println("Not a Session info provider.")
    else {
        println("Is Session Info Provider")
//        (infoProvider as sessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}