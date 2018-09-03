package section5

class MediaMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String,
        val album: String
)

val musicSource = listOf(
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

class MusicService {
    val playlist = musicSource
}

fun main(args: Array<String>) {
    val music = MusicService()
    val playlist = music.playlist
    displayTitles(playlist)
}

fun displayTitles(list: List<MediaMetaData>) {
    for (meta in list)
        println(meta.title)
}

