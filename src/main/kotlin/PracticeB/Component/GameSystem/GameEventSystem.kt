package PracticeB.Component.GameSystem

import PracticeB.Interface.GameSystem

class GameEventSystem() : GameSystem {
    private var gameEventSystem: GameEventSystem? = null;

    override fun initial() {
        gameEventSystem = this;
    }
    override fun update() {
        gameEventSystem?.test();
    }
    override fun release() {
        println("gameEventSystem release");
    }

    private fun test() {
        println("gameEventSystem test");
    }
}