package section2

/**
 * The interface Score provides a common type to the class Run
 */
interface Score

/**
 * Class run will be used to type check against the value total
 */
open class Run(val runs: Int) : Score

/**
 * This exercise will use safe casts for type checking against null values
 */
fun main(args: Array<String>) {

    val total: Any = 123
    // Typecheck total against the Class Run. Then return the runs property and
    // assign it to a new variable called runs
    // Then add an Elvis operator to return zero if the type cast is unsuccessful
}

