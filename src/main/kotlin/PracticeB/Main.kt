package PracticeB

import PracticeB.Component.GameSystem.BattleSystem
import PracticeB.Component.GameSystem.CampSystem
import PracticeB.Component.GameSystem.GameEventSystem
import PracticeB.Component.UserInterface.SoldierUI

fun main(args: Array<String>) {
    val m_PBDGame = PBaseDefenseGame();
    m_PBDGame.initial();
    m_PBDGame.soldierTest()

}

/**
 * PBaseDefenseGame 作為 mediator
 * BattleSystem等system都使用GameSystem的介面
 * SoldierUI等UI都使用UserInterface的介面
 * 架構
 * SoldierUI -> UserInterface -> PBaseDefenseGame <- GameSystem <- BattleSystem
 */
class PBaseDefenseGame {
    //遊戲系統
    private var gameEventSystem = GameEventSystem();
    private val campSystem = CampSystem();
    private val battleSystem = BattleSystem();

    //介面
    private var soldierUI = SoldierUI();

    fun initial(){
        gameEventSystem.initial()
        campSystem.initial()
        battleSystem.initial()

        soldierUI.register(this)
    }

    fun battle(){
        battleSystem.update()
    }

    fun soldierTest(){
        soldierUI.update( campSystem.test())
    }
}
