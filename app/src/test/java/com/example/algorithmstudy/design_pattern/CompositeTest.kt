package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.composite.InfantrySquad
import com.example.algorithmstudy.pattern.structure.composite.Rifleman
import com.example.algorithmstudy.pattern.structure.composite.RocketSoldier
import com.example.algorithmstudy.pattern.structure.composite.Sniper
import org.junit.Test

/**
 *  Composite Pattern
 *
 *  - 유사한 클래스의 일반화하여 통합 관리할 수 있는 패턴
 */
class CompositeTest {

    @Test
    fun testComposite() {
        val squad = InfantrySquad(Rifleman(), Rifleman(), Sniper(), RocketSoldier())

        println(squad.units)
    }
}
