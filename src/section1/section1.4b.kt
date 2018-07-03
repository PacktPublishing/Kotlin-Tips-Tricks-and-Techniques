package section1

import java.text.DateFormat
import java.util.*

val Date.short: String
    get() = DateFormat.getDateInstance().format(this)

fun main(args: Array<String>) {
//    println("Current date = $date")
    println("Current date = ${Date().short}")
}

//fun Date.simple() = DateFormat.getDateInstance().format(this)