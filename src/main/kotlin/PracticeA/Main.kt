import PracticeA.OpenGL
import PracticeA.Sphere

fun main(args: Array<String>) {
    val openGL = OpenGL()
    val sphere = Sphere()
    sphere.initialRenderEngine(openGL)
    sphere.draw()
}

