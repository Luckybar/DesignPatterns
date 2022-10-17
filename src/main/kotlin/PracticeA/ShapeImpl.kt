package PracticeA

abstract class IShape {
    protected lateinit var renderEngine: RenderEngine

    fun initialRenderEngine(renderEngine: RenderEngine){
        this.renderEngine = renderEngine
    }

    abstract fun draw();
}

class Sphere: IShape(){
    override fun draw() {
        renderEngine.render("Sphere")
    }
}

class Cube: IShape(){
    override fun draw() {
        renderEngine.render("Cube")
    }
}

class Cylinder: IShape(){
    override fun draw() {
        renderEngine.render("Cylinder")
    }
}