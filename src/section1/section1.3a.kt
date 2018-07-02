package section1

fun main(args: Array<String>) {
    println("Total Score = ${cricketScore(12, 4, 3)}")
}

fun cricketScore(singles: Int, boundaries: Int, sixer: Int) =
        singles + boundaries * 4 + sixer * 6