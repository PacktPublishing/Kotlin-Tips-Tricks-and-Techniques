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
    println(CameraMode().mode)
    println(CameraMode(2000).mode)
    println(CameraMode(1.2).mode)
    println(CameraMode(shutter = 2000, aperture = 1.2).mode)
}

