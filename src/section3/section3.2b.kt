package section3

open class TextBuilderSuper{
    var capacity = 0
    var content: String? = null
    constructor() {
        capacity = 16
    }
    constructor(_capacity: Int) {
        capacity = _capacity
    }
    constructor(_content: String?) {
        _content.let {
            content = _content
        }
    }
}

fun main(args: Array<String>) {

}