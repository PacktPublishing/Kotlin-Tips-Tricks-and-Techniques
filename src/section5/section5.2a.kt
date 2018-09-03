package section5

class BackGroundThread : Thread() {
    override fun run() {
        println(Thread.currentThread())
    }
}

var backgroundThread: BackGroundThread? = null

fun main(args: Array<String>) {

    createBackgroundThread()
    startBackgroundThread()
    stopBackgroundThread()

}

fun createBackgroundThread() {
    backgroundThread = BackGroundThread()
}

fun startBackgroundThread() {
        backgroundThread!!.start()
    }

fun stopBackgroundThread() {
    try {
        backgroundThread!!.join()
        backgroundThread = null
    } catch (e: InterruptedException) {
        println(e.printStackTrace())
    }
}