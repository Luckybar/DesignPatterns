package PracticeB.Component.UserInterface

import PracticeB.Interface.UserInterface

class SoldierUI: UserInterface() {

    override fun update(message:String) {
        println("soldierUI update $message");
    }

    override fun release() {
        println("soldierUI release");
    }

}