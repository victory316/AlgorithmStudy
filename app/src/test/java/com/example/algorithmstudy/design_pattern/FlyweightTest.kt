package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.creation.prototype.MyComputer
import com.example.algorithmstudy.pattern.structure.flyweight.WeaponFactory
import org.junit.Test

/**
 *  Flyweight Pattern
 *
 *  - 단일 객체 생성으로 메모리 효율을 높이는 패턴
 */
class FlyweightTest {

    @Test
    fun testFlyweight() {
        val factory = WeaponFactory()

        println(factory.getWeapon(WeaponFactory.WEAPON_MINIGUN))
        println(factory.getWeapon(WeaponFactory.WEAPON_MINIGUN))
        println(factory.getWeapon(WeaponFactory.WEAPON_SHOTGUN))
        println(factory.getWeapon(WeaponFactory.WEAPON_SHOTGUN))
    }
}
