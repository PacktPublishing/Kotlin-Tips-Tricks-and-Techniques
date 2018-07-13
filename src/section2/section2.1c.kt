package section2

open class Try(val points: Int)

fun main(args: Array<String>) {

    val total: Any = 15
    println(score(total))
}

fun score(total: Any): Int {
    return (total as Try).points
}

