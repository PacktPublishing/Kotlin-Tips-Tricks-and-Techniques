package section5

/**
 * First lazy implementation using a backing property
 * will be implemented in this class.
 * Then that implementation will be replaced with
 * the by lazy delegate.
 */
class MediaMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String,
        val album: String
)

/**
 * Collection which contains a list of
 * MediaMetaData
 */
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

/**
 * This exercise will implement lazy implementation using a
 * backing property in the MediaMetaData class.
 * Then the lazy implementation will be replaced with the
 * by lazy delegate.
 */
fun main(args: Array<String>) {
    val music = MusicService()
    val playlist = music.playlist
    displayTitles(playlist)
}

fun displayTitles(list: List<MediaMetaData>) {
    for (meta in list)
        println(meta.title)
}

