package section2

/**
 * Object to be shared between the two threads
 */
class SharedObject(var sharedData: String = "")

/**
 * First thread to use the shared data.
 * A synchronized lock will first be implemented. Then the ReentrantLock
 * will replace the synchronized lock.
 */
class BasicThreadOne(var shared: SharedObject): Thread() {
    override fun run() {
        super.run()

        shared.sharedData = Thread.currentThread().toString()
        Thread.sleep(2000)
    }
}

/**
 * Second thread to use the shared data.
 * A synchronized lock will first be implemented. Then the ReentrantLock
 * will replace the synchronized lock.
 */
class BasicThreadTwo(var shared: SharedObject): Thread() {
    override fun run() {
        super.run()

        shared.sharedData = Thread.currentThread().toString()
    }
}

/**
 * This exercise will demonstrate thread safety by using a shared object
 * A SharedObject instance will be passed to each of the BasicThread class instances.
 * A timer will be used to test for thread contention
 */
fun main(args: Array<String>) {

}

