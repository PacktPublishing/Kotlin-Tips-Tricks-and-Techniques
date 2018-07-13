package section1

fun main(args: Array<String>) {

    val phoneNumber = "+447911123456"

        with(phoneNumber) {
            println("country: ${substring(0,3)}")
            println("destination: ${substring(3,7)}")
            println("subscriber: ${substring(7,13)}")
            println("size: $length")
        }


}



