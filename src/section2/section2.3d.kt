package section2

fun main(args: Array<String>) {
    var list : String? = null
//    list = populateList(list)
    list = arrayListOf("1", null, "5", null, "8").toString()
//    list = null
    println(stringToIntList(list.toString()))
//    stringToIntList(list)
}

/*
fun stringToIntList(data: ArrayList<String?>?) {
 */
/*   data?.let {
        println(it.filterNotNull())
    }*//*

    println(data)
}
*/

/*fun populateList(list: StringBuilder?): String? {
    return list.also {
        it?.append("1")
    }.toString()
}*/
fun stringToIntList(data: String?): List<Int>? {
    return data?.let {
        it.split(",").map {
            try {
                it.toInt()
            } catch (ex: NumberFormatException) {
                println("Cannot convert $it to number")
                null
            }
        }
    }?.filterNotNull()
}
