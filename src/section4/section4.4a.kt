package section4

class MediaMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String,
        val album: String
)

fun main(args: Array<String>) {

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

}

