package section1

fun main(args: Array<String>) {

    val total = cricketScore(12, 4, 0)

    println("total score = $total")
}

fun cricketScore(singles: Int, boundaries: Int, sixer: Int) =
        singles + boundaries * 4 + sixer * 6