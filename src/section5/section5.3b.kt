package section5

fun main(args: Array<String>) {

}

fun functionArgumentLambda(task: (Int, Int) -> Int) {
    println(task(2, 3))
}
