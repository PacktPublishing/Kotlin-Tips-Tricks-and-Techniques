package section1

/**
 * The tel.substring(0, 2) call will be replaced with
 * the newly created String.countryCode call
 */
fun main(args: Array<String>) {
    val tel = "819012345678"
    println("Number = $tel")
    println("Country code = ${tel.substring(0, 2)}")
}

/**
 * Create an extension property called String.countryCode
 * Which will return the first two elements of the string, representing
 * the country code.
 */
