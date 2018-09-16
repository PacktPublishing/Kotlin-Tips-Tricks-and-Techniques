package section4

/**
 * Used to contain song meta data
 * The universal methods will be added and demonstrated
 * Then the universal methods will be replaced with the data class
 */
private class MusicMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String
)

/**
 * The source value will be used for checking the toString(),
 * equals() and hashCode() methods in the MusicMetaData class
 */
fun main(args: Array<String>) {
    // Create a single instance of MusicMetaData
    val source = MusicMetaData(
            100,
            "Come Fly with Me",
            "Frank Sinatra"
    )
}