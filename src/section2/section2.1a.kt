package section2

fun main(args: Array<String>) {

    var phoneNumber: String? = null

    println(checkNumber(phoneNumber))

}

fun checkNumber(data: String?): String {
    return if (data != null)
        data
    else
        "+447911123456"
}

