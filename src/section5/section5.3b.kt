package section5

fun main(args: Array<String>) {

}

inline fun functionArgumentLambda(task: (Int, Int) -> Int) {
    println(task(2, 3))
}
