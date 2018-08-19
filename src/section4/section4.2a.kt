package section4

fun main(args: Array<String>) {

    displayTotal(total(2, 3))

}

fun total(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun displayTotal(total:  Int) {
    println(total)
}
