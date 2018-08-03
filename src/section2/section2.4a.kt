package section2

class SharedObject(var sharedData: String = "")

class BasicThreadOne(var shared: SharedObject): Thread() {
    override fun run() {
        super.run()

        shared.sharedData = Thread.currentThread().toString()
        Thread.sleep(2000)
    }
}

class BasicThreadTwo(var shared: SharedObject): Thread() {
    override fun run() {
        super.run()

        shared.sharedData = Thread.currentThread().toString()
    }
}

fun main(args: Array<String>) {

}

