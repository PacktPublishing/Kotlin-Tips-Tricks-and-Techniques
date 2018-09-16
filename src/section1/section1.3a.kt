package section1

/**
 * Used to call the cricketScore() function and display the returned result
 */
fun main(args: Array<String>) {

    // cricketScore arguments will be converted to named arguments
    val total = cricketScore(12, 4, 0)

    println("total score = $total")
}

/**
 * First the current parameters will be converted to default parameters.
 * Then the parameters will be replaced with a vararg.
 */
fun cricketScore(singles: Int, boundaries: Int, sixer: Int) =
        singles + boundaries * 4 + sixer * 6