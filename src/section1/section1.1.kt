package section1

fun main(args: Array<String>) {
    val firstValue = 10
    val secondValue = 20
    println("Smallest value is: ${min(firstValue, secondValue)}")
}

fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
