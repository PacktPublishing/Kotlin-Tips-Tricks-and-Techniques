package section5

/**
 * Add public var javaData to the companion object.
 * After that the @JvmField annotation be added to
 * javaData
 */
class MetaJava {

    companion object {
        public var javaData = "Accessible from Java"

    }
}

/**
 * This exercise will demonstrate the additional methods
 * created with a public value inside a companion object.
 * Then the @JvmField will be applied to the value and
 * the results observed in the equivalent Java code.
 */
fun main(args: Array<String>) {
    println(MetaJava.javaData)
}