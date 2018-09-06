package section5

class MetaJava {

    companion object {
        public var javaData = "Accessible from Java"

    }
}
fun main(args: Array<String>) {
    println(MetaJava.javaData)
}