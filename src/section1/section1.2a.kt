package section1

fun main(args: Array<String>) {

    val age = 16
    println("Can drive in ${checkCountries(age)}")
}

fun checkCountries(age: Int) =
        if (age < 14)
            "no country"
        else if (age < 15)
            "Guyana"
        else if (age < 16)
            "Guyana and Canada"
        else if (age < 17)
            "Guyana, Canada and France"
        else if (age < 18)
            "Guyana, Canada, France and Alberta"
        else "any country"
