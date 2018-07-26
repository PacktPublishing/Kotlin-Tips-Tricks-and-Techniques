package section2

interface Score
open class Run(val runs: Int) : Score

fun main(args: Array<String>) {

    val total: Any = 123
    val cricket = total as Run

    println(cricket.runs)
}

