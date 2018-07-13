package section1

interface Score
class Run(val runs: Int) : Score
class Boundary(val boundaries: Int): Score
class Six(val sixes: Int) : Score

fun main(args: Array<String>) {
    val total = scores(Run(40)) + scores(Boundary(12)) + scores(Six(4))
    println("Total cricket score is: $total")
}

fun scores(score: Score) =
        when (score) {
            is Run -> score.runs
            is Boundary -> score.boundaries * 4
            is Six -> score.sixes * 6
            else -> throw IllegalArgumentException("Unknown Type")
        }