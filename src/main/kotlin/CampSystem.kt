

class CampSystem() : GameSystem {
    private var campSystem: CampSystem? = null;

    override fun initial() {
        campSystem = this;
    }
    override fun update() {
        campSystem!!.test();
    }
    override fun release() {
        println("campSystem release");
    }

    private fun test() {
        println("campSystem test");
    }
}