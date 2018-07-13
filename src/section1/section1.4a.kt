package section1

import java.text.DateFormat
import java.util.*

fun main(args: Array<String>) {
    val date = Date()
    println("Current date = ${date.short()}")
}

fun Date.short() =
        DateFormat.getDateInstance().format(this)

