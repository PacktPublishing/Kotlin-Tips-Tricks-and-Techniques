package section5

/**
 * Class to be used to creating a collection
 */
class MediaMetaSequence(
        val id: Int = 0,
        val title: String,
        val artist: String,
        val album: String
)

/**
 * This exercise will demonstrate the impact of calling
 * multiple chained operations on a collection.
 * Then a new function will be created, displayTitleSequences
 * which will use sequences for improved performance.
 */
fun main(args: Array<String>) {

    // The collection which will be used for comparing
    // chained operations against sequences
    val musicSorce = listOf(
            MediaMetaSequence(
                    100,
                    "Come Fly with Me",
                    "Frank Sinatra",
                    "Come Fly with me"
            ),
            MediaMetaSequence(
                    101,
                    "Brazil",
                    "Frank Sinatra",
                    "Come Fly with me"
            ),
            MediaMetaSequence(
                    102,
                    "Blue Hawaii",
                    "Frank Sinatra",
                    "Come Fly with me"
            ),
            MediaMetaSequence(
                    103,
                    "Suspicion",
                    "Elvis Presley",
                    "Pot Luck"
            )
    )

    // In the second part of the exercise replace displayAlbum titles
    // the newly created function displayAlbumTitles
    val albumTitles = displayAlbumTitles(musicSorce, "Come Fly with me")
    println("title: $albumTitles")
}

/**
 * Create a function called displayTitleSequences.
 * This will be used to filter & map this list
 */


/**
 * This function will be used at the start of the exercise to
 * demonstrate the extra lists created when chaining collection
 * operations
 */
fun displayAlbumTitles(source: List<MediaMetaSequence>, album: String): List<String> {
    return source.filter {
        it.album == album
    }.map {
        it.title
    }
}

