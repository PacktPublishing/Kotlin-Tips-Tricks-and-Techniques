package section2

/**
 * This exercise will check the value tries for null safety.
 * If tries has a value, convertTrytoPoints will be called. It tries
 * is null the value zero will be returned
 */
fun main(args: Array<String>) {

    var tries: Int? = null
    // Create an if expression to check tries for null. Either return the
    // result of convertTryToPoints or return 0
    // Then replace the if expression with Let and the Elvis operator
}

/**
 * Used to check the null safety of the parameter tries
 */
fun convertTryToPoints(tries: Int) = tries * 5