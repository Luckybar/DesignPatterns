package PracticeB

import kotlin.properties.Delegates

abstract class ICharacter {
    var life = 0;
    private lateinit var weapon: IWeapon

    abstract inner class Initialweapon(m_weapon : IWeapon){
        init {
            weapon = m_weapon
        }

        protected fun setAtkPlus(atkPlus:Int){
            weapon.atkPlus = atkPlus
        }

        protected fun setLife(newLife:Int){
            life = newLife
        }

        protected fun atkOnTarget(target:ICharacter){
            weapon.fire(target)
        }

        abstract fun attack(target:ICharacter);
        abstract fun underAttack(atk:Int);
    }
}

//soldier
class CharacterSoldier : ICharacter() {
    inner class SoldierWeapon(m_weapon : IWeapon) : Initialweapon(m_weapon){
        override fun attack(target: ICharacter) {
            setAtkPlus(10)
            atkOnTarget(target)
        }
        override fun underAttack(atk: Int) {
            println("soldier under attack $atk")
        }
    }
}

//Enemy
class CharacterEnemy : ICharacter() {
    inner class EnemyWeapon(m_weapon : IWeapon) : Initialweapon(m_weapon){
        override fun attack(target: ICharacter) {
            setAtkPlus(20)
            atkOnTarget(target)
        }
        override fun underAttack(atk: Int) {
            println("enemy under attack $atk")
        }
    }
}