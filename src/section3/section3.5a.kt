package section3

class CompanionClass {
    private val list = arrayListOf(1.2, 3.3, 4.5)

    fun displayList() = println(list)
}

fun main(args: Array<String>) {
    val companionClass = CompanionClass()
    companionClass.displayList()

}