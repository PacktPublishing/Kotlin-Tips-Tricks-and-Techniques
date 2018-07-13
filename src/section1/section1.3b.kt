package section1

fun main(args: Array<String>) {

    val total = cricketScores(12,40,6)
    println("Total score = $total")
}

fun cricketScores(vararg runs: Int) =
        runs[0] + runs[1] * 4 + runs[2] * 6
