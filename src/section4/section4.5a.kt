package section4

private class MusicMetaData(
        val id: Int = 0,
        val title: String,
        val artist: String
)

fun main(args: Array<String>) {
    val source = MusicMetaData(
            100,
            "Come Fly with Me",
            "Frank Sinatra"
    )
}