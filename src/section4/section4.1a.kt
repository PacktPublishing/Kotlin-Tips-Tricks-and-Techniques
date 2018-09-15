package section4

fun main(args: Array<String>) {
    // A lambda expression will be added
    // to replace the Sum() function
    val total = sum(2, 3)
    println(total)
}

/**
 * This function is used at the start of the
 * exercise for demonstration purposes.
 * It will then be replaced with a Lamda expression.
 */
fun sum(value1: Int, value2: Int): Int {
    return value1 + value2
}