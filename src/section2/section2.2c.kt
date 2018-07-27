package section2

fun main(args: Array<String>) {

    val total = object : Run(123) {}
    val cricket = (total as? Run).let {
        it?.runs
    } ?: 0

    println(cricket)
}