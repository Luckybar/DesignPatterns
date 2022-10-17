package PracticeA

abstract class RenderEngine(){
    abstract fun render(name: String)
}

class OpenGL: RenderEngine(){
    override fun render(name: String) {
        openGLRender(name)
    }
    fun openGLRender(name: String){
        println("Rendering $name with OpenGL")
    }
}

class DirectX: RenderEngine(){
    override fun render(name: String) {
        directXRender(name)
    }
    fun directXRender(name: String){
        println("Rendering $name with DirectX")
    }
}