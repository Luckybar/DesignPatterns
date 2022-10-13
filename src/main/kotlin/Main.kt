/**
 * 透過設定為其他class的參考 來將低真的使用singleton
 */
class PBaseDefenseGame{
    fun initial(){
        val m_camp = CampSystem()
    }
}

abstract class IGameSystem{
    protected var m_PBDGame = PBaseDefenseGame();
    abstract fun initial();
    abstract fun update();
    abstract fun release();
}


class CampSystem: IGameSystem(){
    override fun initial(){
        m_PBDGame.initial()
        println("CampSystem initial");
    }
    override fun update(){
        println("CampSystem update");
    }
    override fun release(){
        println("CampSystem release");
    }
}


fun main(args: Array<String>) {

}