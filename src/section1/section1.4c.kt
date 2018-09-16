package section1

/**
 * A replace call will be made on the tel variable to replace the
 * first two elements of the string.
 * Then that method will be replaced a setter call to the extension
 * property StringBuilder.countryCode
 */
fun main(args: Array<String>) {
    val tel = StringBuilder("819012345678")
    println("Number = $tel")
}

/**
 * A setter property accessor will be added to allow
 * the replacement of the first two elements in the string
 */
val StringBuilder.countryCode: String
    get() = this.substring(0, 2)

