package section2

class BasicThread(): Thread() {
    override fun run() {
        super.run()

        Thread.sleep(1000)
        println("${Thread.currentThread()}: has run")
    }
}

fun main(args: Array<String>) {
    val thread = BasicThread()

    thread.strength = 50
    thread.start()
//    thread.die(-1000)

}

var Thread.strength: Int
    get() = this.priority
    set(value) {
        try {
            this.priority = value
        } catch (e: IllegalArgumentException) {
            when {
                value > Thread.MAX_PRIORITY -> this.priority = Thread.MAX_PRIORITY
                value < Thread.MIN_PRIORITY -> this.priority = Thread.MIN_PRIORITY
            }
        }
    }

fun Thread.die(time: Long = 0) {
    try {
        join(time)
    } catch (e: IllegalArgumentException) {
        join(Math.abs(time))
    }
}

