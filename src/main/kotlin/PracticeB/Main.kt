package PracticeB


fun main(args: Array<String>) {
    val soldier = CharacterSoldier()
    val enemy = CharacterEnemy()
    val gun = WeaponGun()
    val rocket = WeaponRocket()
    val soldierWeapon = soldier.SoldierWeapon(gun)
    val enemyWeapon = enemy.EnemyWeapon(rocket)
    soldierWeapon.attack(enemy)
    enemyWeapon.attack(soldier)
}