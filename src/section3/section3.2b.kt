package section3

/**
 * Create a sub-class from TextBuilderSuper
 * Then add secondary constructors which will called the applicable super class constructor
 */


/**
 * TextBuilder super will be used as the parent class for TextBuilderChild
 */
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

/**
 * This exercise will demonstrate initializing a super classes constructors
 * from the child classes secondary constructors.
 */
fun main(args: Array<String>) {
    // Create instances of TextBuilderChild which will call each secondary constructor
    // Then display the capacity and content of the instances

}