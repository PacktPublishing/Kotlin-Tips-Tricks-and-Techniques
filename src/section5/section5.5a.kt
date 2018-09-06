package section5

class MediaMetaSequence(
        val id: Int = 0,
        val title: String,
        val artist: String,
        val album: String
)

fun main(args: Array<String>) {

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

    val albumTitles = displayAlbumTitles(musicSorce, "Come Fly with me")
    println("title: $albumTitles")
}

fun displayAlbumTitles(source: List<MediaMetaSequence>, album: String): List<String> {
    return source.filter {
        it.album == album
    }.map {
        it.title
    }
}

