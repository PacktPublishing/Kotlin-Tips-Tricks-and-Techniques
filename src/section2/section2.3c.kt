package section2

class Rugby(val tries: Int? = null, val conversions: Int? = null, val penalties: Int? = null) {
//    fun totalScore(): Int? {
//        return tries?.let { it * 5 } +
//             conversions?.let { it * 2 }
//    }
}

fun main(args: Array<String>) {
    val game1 = Rugby(
            tries = 3,
            conversions = 1,
            penalties = 2
    )
    val game2 = Rugby(
            penalties = 5
    )
    val game3 = Rugby(
            tries = 5,
            conversions = 5
    )

    val scores = listOf(game1, game2, game3)
    println(scores)
}