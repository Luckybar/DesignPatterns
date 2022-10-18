package PracticeB

abstract class IWeapon {
    var atkPlus = 0;
    var atk= 0;
    protected var range = 0;

    // 其他效果
    protected fun showEffect(weapon:String) {
        println("$weapon effect")
    }
    protected fun specialEffect(charLife:Int){
        println("special effect char life $charLife")
    }

    // 攻擊目標
    abstract fun fire(thetarget: ICharacter)
}

//Gun
public class WeaponGun : IWeapon() {
    override fun fire(thetarget: ICharacter) {
        showEffect("gun")
        specialEffect(thetarget.life)
    }
}

//rocket
public class WeaponRocket : IWeapon() {
    override fun fire(thetarget: ICharacter) {
        showEffect("rocket")
        specialEffect(thetarget.life)
    }
}