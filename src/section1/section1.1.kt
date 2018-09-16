package section1

/**
 * Main function is used to call the min() function
 * with the two values provided as arguments
 */
fun main(args: Array<String>) {
    val firstValue = 10
    val secondValue = 20
    println("Smallest value is: ${min(firstValue, secondValue)}")
}

/**
 * This function is implemented with a block body.
 * Replace the block body with an expression body.
 */
fun min(value1: Int, value2: Int): Int {
    if (value1 < value2){
        return value1
    } else {
        return value2
    }
}
