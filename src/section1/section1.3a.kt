package section1

fun main(args: Array<String>) {

    val total = cricketScore(12, 40, 6)

    println("total score = $total")
}

fun cricketScore(singles: Int, boundaries: Int, sixer: Int) =
        singles + boundaries * 4 + sixer * 6