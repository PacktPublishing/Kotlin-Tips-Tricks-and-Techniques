package section1

fun main(args: Array<String>) {
    println("Enter age: ")
    val age = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    if (age != null)
        println("Can drive in ${checkCountries(age)}")
}

fun checkCountries(age: Int): String {
    return if (age < 14)
        "no country"
     else if (age < 15)
        "Guyana"
     else if (age < 16)
        "Guyana and Canada"
     else if (age < 17)
        "Guyana, Canada and France"
     else if (age < 18)
        "Guyana, Canada, France and Alberta"
     else
        "any country"
}
