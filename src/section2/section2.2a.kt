package section2

/**
 * This exercise introduces the Let extenstion function to
 * do null safe calls with the value tries
 *
 */
fun main(args: Array<String>) {

    var tries: Int? = null
    // Initialize tries with a value and then use the Let function
    // to make null safe call when passing tries to the function convertToPoints

}

/**
 * Use to test the null safety of the parameter tries
 */
fun convertToPoints(tries: Int) {
    println(tries * 5)
}