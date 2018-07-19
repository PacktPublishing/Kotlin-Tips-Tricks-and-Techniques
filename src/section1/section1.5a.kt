package section1

class SimpleThread : Thread() {
    override fun run() {
        println("${Thread.currentThread()} has run")
    }
}
fun main(args: Array<String>) {
    val thread = SimpleThread().also {

    }
//    thread.name = "MyThread"
//    thread.start()
}