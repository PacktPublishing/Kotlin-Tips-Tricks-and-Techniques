package section1

fun main(args: Array<String>) {
    val tel = StringBuilder("819012345678")
    println("Number = $tel")
    println("Country code = ${tel.countryCode}")
}

val StringBuilder.countryCode: String
    get() = this.substring(0, 2)

