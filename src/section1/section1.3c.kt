package section1

fun main(args: Array<String>) {
    val cricketList = intArrayOf(64, 14, 3)
//    val cricketTotal = cricketTotals(*cricketList)
//    println("Cricket score = $cricketTotal")
}

fun cricketTotals(vararg runs: Int) =
    runs[0] + runs[1] * 4 + runs[2] * 6
