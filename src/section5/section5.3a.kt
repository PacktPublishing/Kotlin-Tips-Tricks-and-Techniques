package section5

/**
 * This exercise will demonstrate the overheads of capturing lambda expressions
 * and none capturing lamda expressions.
 */
fun main(args: Array<String>) {
    // Create a value called expression. This will be used to create
    // a capturing expression.

    // Call the functionArgument method, first with the capturing expression
    // and then with a none capturing expression.

}

/**
 * Higher order function which will first have
 * a capturing expression passed to it.
 * After that a none-caputering expression will
 * be passed.
 */
fun functionArgument(task: () -> Unit) {
    task()
}


