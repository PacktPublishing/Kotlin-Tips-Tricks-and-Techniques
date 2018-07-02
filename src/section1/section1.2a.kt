package section1

fun main(args: Array<String>) {
    println("Enter age: ")
    val age = try {
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    if (age != null)
        checkAge(age)
}

fun checkAge(age: Int) {
    if (age < 14) {
        println("$age is to young to drive in any country")
    } else if (age < 15) {
        println("$age is old enough to drive in Guyana")
    } else if (age < 16) {
        println("$age is old enough to drive in Guyana and Canada")
    } else if (age < 17) {
        println("$age is old enough to drive in Guyana, Canada and France")
    } else if (age < 18) {
        println("$age is old enough to drive in Guyana, Canada, France and Alberta")
    } else {
        println("$age is old enough to drive in any country")
    }
}
