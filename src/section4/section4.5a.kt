package section4

/**
 * Used to contain song meta data
 * Add the universal methods toString(), equals() and hashCode()
 * Then replace the universal methods with data class
 */
private class MusicMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String
)

/**
 * This exercise will demonstrate the implementation and usage
 * of the class universal methods
 * The universal methods will be implemented inside the MusicMetaData
 * manually.
 * And then replaced with the data class.
 */
fun main(args: Array<String>) {
    // Create a single instance of MusicMetaData
    val source = MusicMetaData(
            100,
            "Come Fly with Me",
            "Frank Sinatra"
    )
    // Display source.toString

    // Create a second instance of source and check them with
    // the equals method

    // Create a hashset of source and then check the hashcode
    // against the second instance of source
}