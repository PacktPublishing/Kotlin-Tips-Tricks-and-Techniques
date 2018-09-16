package section4

/**
 * Used as a template for creating a list of songs
 */
class MediaMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String,
        val album: String
)

/**
 * List of MediaMetaData songs.
 */
val musicSorce = listOf(
            MediaMetaData(
                    100,
                    "Come Fly with Me",
                    "Frank Sinatra",
                    "Come Fly with me"
            ),
            MediaMetaData(
                    101,
                    "Brazil",
                    "Frank Sinatra",
                    "Come Fly with me"
            ),
            MediaMetaData(
                    102,
                    "Blue Hawaii",
                    "Frank Sinatra",
                    "Come Fly with me"
            ),
            MediaMetaData(
                    103,
                    "Suspicion",
                    "Elvis Presley",
                    "Pot Luck"
            )
    )

/**
 * Create a function called buildPlayList(), which will
 * build a playlist
 */


/**
 * Create a function called displayPlayListTitles() to display the playlist titles
 */


/**
 * Create a function called displayAlbumTitles().
 * It will chain the filter and map calls to return the album titles
 */



fun main(args: Array<String>) {
    // Call the buildPlayList() and displayPlayListTitles() first to display the titles
    // Then replace the above two function calls with the displayAblumTitles() function.

}

