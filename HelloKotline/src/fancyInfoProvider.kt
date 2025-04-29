class fancyInfoProvider: BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Humanization"

    override val providerInfo: String
        get() = "Fancy Info Provider."

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}