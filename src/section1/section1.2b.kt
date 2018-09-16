package section1

/**
 * Interface Score is used to provide a common Type to the
 * Run, Boundary and Six classes
 */
interface Score

/**
 * These three classes will be used to demonstrate the
 * usage of smart casts
 */
class Run(val runs: Int) : Score
class Boundary(val boundaries: Int): Score
class Six(val sixes: Int) : Score

/**
 * Creates instances of each of the classes and passes those
 * instances to the scores function where type checking will take place
 * The scores function will then return the total
 */
fun main(args: Array<String>) {
    val total = scores(Run(40)) + scores(Boundary(12)) + scores(Six(4))
    println("Total cricket score is: $total")
}

/**
 * Replace the current if-cascade implementation with a when expression
 * using smart casts
 */
fun scores(score: Score): Int {
    return if (score is Run) score.runs
    else if (score is Boundary) score.boundaries * 4
    else if (score is Six) score.sixes * 6
    else throw IllegalArgumentException("Unknown Type")
}