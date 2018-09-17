package section5

/**
 * Class to be used as the type for the var backgroundThread
 */
class BackGroundThread : Thread() {
    override fun run() {
        println(Thread.currentThread())
    }
}

// This value will get converted to a lateinit value
var backgroundThread: BackGroundThread? = null

/**
 * This exercise will demonstrate the difference in implementation
 * between a nullable value and lateinit value using the var backgroundThread
 */
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