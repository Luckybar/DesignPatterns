package PracticeB.Interface

import PracticeB.PBaseDefenseGame

interface UserInterfaceI {
    var m_PBDGame: PBaseDefenseGame

}

abstract class UserInterface : UserInterfaceI {
    override lateinit var m_PBDGame: PBaseDefenseGame
    private var m_bActive: Boolean = false

    fun register(pBaseDefenseGame: PBaseDefenseGame){
        m_PBDGame = pBaseDefenseGame;
    }

    fun show(){
        m_bActive = true;
    }

    fun hide(){
        m_bActive = false;
    }

    abstract fun update(message:String);
    abstract fun release();
}

