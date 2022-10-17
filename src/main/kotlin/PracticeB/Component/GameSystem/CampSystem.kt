package PracticeB.Component.GameSystem

import PracticeB.Interface.GameSystem

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

    fun test(): String {
        return "campSystem test";
    }
}