package section2

var message : String? = null

fun main(args: Array<String>) {
    message = "I am not null"
    showMessage()
}

fun showMessage() {
    message?.let { message ->
        println(message)
    }
}