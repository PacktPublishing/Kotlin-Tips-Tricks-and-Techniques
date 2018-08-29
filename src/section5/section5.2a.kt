package section5

class ExamResults {
    var intResults : ArrayList<Double>? = null
    set(value) {
        value!!.removeAll(arrayListOf(0.0))
        field = value
    }

    val average: Double
    get() {
        return intResults!!.average()
    }
}

fun main(args: Array<String>) {
//    val intScores = arrayListOf(25.0, 0.0, 77.7, 0.0, 50.0)
    val examResults = ExamResults()
//    examResults.intResults = intScores
    println(examResults.intResults)
    println(examResults.average)
}