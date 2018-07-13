package section2

open class Try(val points: Int)

fun main(args: Array<String>) {
//    val total: Any = 15
    val total = object : Try(15){}
//    val rugby = total as? Try
//    println(rugby?.points)
    println(score(total))
}

fun score(total: Any): Int {
    return (total as? Try)?.points ?: 0
}

