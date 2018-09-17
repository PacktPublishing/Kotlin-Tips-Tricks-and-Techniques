package section5

/**
 * This exercise will demonstrate the effects of boxing and unboxing.
 */
fun main(args: Array<String>) {
    // Call functionArgumentLamda with a lambda argument
    // that matches the function type
}

/**
 * First this function will be called in its current form
 * to demostrate boxing and unboxing
 * Then the function will be inlined to show the removal
 * of boxing and unboxing.
 */
fun functionArgumentLambda(task: (Int, Int) -> Int) {
    println(task(2, 3))
}
