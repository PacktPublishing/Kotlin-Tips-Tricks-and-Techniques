package section2

/**
 * Main function will be used to pass a null argument
 * to the checkNumber() function to demonstrate null type checking
 */
fun main(args: Array<String>) {

    var phoneNumber: String? = null
    println(checkNumber(phoneNumber))
}

/**
 * Replace the if expression with the Elvis operator
 */
fun checkNumber(data: String?): String {
    return if (data != null)
        data
    else
        "+447911123456"
}

