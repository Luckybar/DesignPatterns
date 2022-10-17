package PracticeB.Component.GameSystem

import PracticeB.Interface.GameSystem

class BattleSystem() : GameSystem {
    private var battleSystem: BattleSystem? = null;

    override fun initial() {
        battleSystem = this;
    }
    override fun update() {
        battleSystem!!.test();
    }
    override fun release() {
        println("battleSystem release");
    }

    private fun test() {
        println("battleSystem test");
    }
}