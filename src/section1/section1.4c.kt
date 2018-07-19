package section1

fun main(args: Array<String>) {
    val tel = StringBuilder("819012345678")
    tel.countryCode = "64"
    println("Number = $tel")
    println("Country code = ${tel.countryCode}")
}

var StringBuilder.countryCode: String
    get() = this.substring(0, 2)
    set(value) {
        this.replace(0, 2, value)
    }

