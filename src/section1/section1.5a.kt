package section1

fun main(args: Array<String>) {

    val phoneNumber = "+447911123456"

    println("country: ${phoneNumber.substring(0,3)}")
    println("destination: ${phoneNumber.substring(3,7)}")
    println("subscriber: ${phoneNumber.substring(7,13)}")
    println("size: ${phoneNumber.length}")
}



