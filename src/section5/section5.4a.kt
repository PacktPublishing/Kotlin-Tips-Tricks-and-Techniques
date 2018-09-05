package section5

class MetaData {

    companion object {
        fun newInstance() = MetaData()
    }

}

fun main(args: Array<String>) {

    val meta = MetaData.newInstance()
}