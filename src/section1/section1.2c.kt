package section1

fun main(args: Array<String>) {
    val list = listOf(1 , -1, null, -3, 4)
    val nullsLast = list.sortedWith(putNullsLast(naturalOrder()))
    println(nullsLast)
}

public fun <T : Any> putNullsLast(comparator: Comparator<in T>): Comparator<T?> =
        Comparator { a, b ->
            if (a === b) {
                0
            }
            else if (a == null) {
                1
            }
            else if (b == null) {
                -1
            }
            else {
                comparator.compare(a, b)
            }
        }