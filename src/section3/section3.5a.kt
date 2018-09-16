package section3

/**
 * CameraMode class uses secondary constructors.
 * These will be replaced with a companion object method
 * to simply the code.
 */
class CameraMode {

    val mode: String

    constructor() {
        mode = "auto"
    }

    constructor(shutter: Int) {
        mode = "shutter priority"
    }

    constructor(aperture: Double) {
        mode = "aperture priority"
    }

    constructor(shutter: Int, aperture: Double) {
        mode = "manual"
    }

}

/**
 * This exercise will demonstrate how to replace a classes
 * secondary constructors by using a factory pattern that
 * uses a companion object.
 */
fun main(args: Array<String>) {
    // Create different instances of CameraMode then display it's mode property
    val modeOne = CameraMode()
    val modeTwo = CameraMode(2000)
    val modeThree = CameraMode(1.2)
    val modeFour = CameraMode(shutter = 2000, aperture = 1.2)
    println(modeOne.mode)
    println(modeTwo.mode)
    println(modeThree.mode)
    println(modeFour.mode)
}

