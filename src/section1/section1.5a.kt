package section1

/**
 * Insert the println calls inside a with() function with phoneNumber
 * provided as the argument.
 * To demonstrate the advantage of using the with() function.
 */
fun main(args: Array<String>) {

    val phoneNumber = "+447911123456"

    println("country: ${phoneNumber.substring(0,3)}")
    println("destination: ${phoneNumber.substring(3,7)}")
    println("subscriber: ${phoneNumber.substring(7,13)}")
    println("size: ${phoneNumber.length}")
}



