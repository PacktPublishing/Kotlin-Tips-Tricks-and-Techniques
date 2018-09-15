package section3

/**
 * This class will be used to apply a custom setter to
 * results property.
 * Which will be used to remove any 0.0 values from the property
 */
class ExamResults {
    var results: ArrayList<Double>? = null
}

fun main(args: Array<String>) {
    // Create an instance of ExamResults
    // Populate its property with scores, then display the
    // contents of the instance
    val scores = arrayListOf(25.0, 0.0, 77.7, 0.0, 50.0)
}