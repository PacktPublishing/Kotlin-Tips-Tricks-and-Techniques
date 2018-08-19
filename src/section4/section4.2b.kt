package section4

fun main(args: Array<String>) {

}

fun newThread(
        start: Boolean = true,
        name: String? = null,
        priority: Int = -1
): Thread {
    val thread = object : Thread() {
        public override fun run() {
            println(Thread.currentThread())
        }
    }
    if (priority > 0)
        thread.priority = priority
    if (name != null)
        thread.name = name
    if (start)
        thread.start()
    return thread
}