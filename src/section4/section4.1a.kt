package section4

/**
 * This exercise will compare lambdas against functions.
 * First the function sum will be executed. And then it
 * will be replaced by a lambda with the same functionality
 */
fun main(args: Array<String>) {
    // Create a lambda expression to replace sum()
    // and return the result to the value sum
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