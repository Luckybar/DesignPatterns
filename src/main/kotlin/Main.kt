fun main(args: Array<String>) {

}

class PBaseDefenseGame {
    private var gameEventSystem = GameEventSystem();
    private val campSystem = CampSystem();
    private val battleSystem = BattleSystem();

    fun initial(){
        gameEventSystem.initial();
        campSystem.initial();
        battleSystem.initial();
    }

    fun battle(){
        battleSystem.update();
    }
}
