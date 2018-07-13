package section1

fun main(args: Array<String>) {

    val total = cricketScore(singles = 12, sixer = 4)

    println("total score = $total")
}

fun cricketScore(singles: Int=0, boundaries: Int=0, sixer: Int=0) =
        singles + boundaries * 4 + sixer * 6