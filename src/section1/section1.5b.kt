package section1

/**
 * This class will be provided to the main() function
 * to support demonstration of the also and apply extension
 * functions
 */
class SimpleThread : Thread() {
    override fun run() {
        println("${Thread.currentThread()} has run")
    }
}

/**
 * Create an instance of SimpleThread. Then call the also extension function.
 * Inside the also function set the priority and name properties and then start
 * the thread.
 * Then replace the also extension function with the apply extension function.
 */
fun main(args: Array<String>) {

}