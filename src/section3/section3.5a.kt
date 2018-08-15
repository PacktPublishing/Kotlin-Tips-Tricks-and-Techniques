package section3

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

fun main(args: Array<String>) {
    val modeOne = CameraMode()
    val modeTwo = CameraMode(2000)
    val modeThree = CameraMode(1.2)
    val modeFour = CameraMode(shutter = 2000, aperture = 1.2)
    println(modeOne.mode)
    println(modeTwo.mode)
    println(modeThree.mode)
    println(modeFour.mode)
}

