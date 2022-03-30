package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.creation.abstractfactory.HQ
import com.example.algorithmstudy.pattern.creation.abstractfactory.InfantryUnits
import org.junit.Test

/**
 *  AbstractFactory Pattern
 *
 *  - 하나의 추상 팩토리 클래스를 따라 손쉽게 객체의 생성이 가능
 *  - 추상 팩토리 선언을 통해 유사한 성격을 가지면서 다른 클래스들을 선언해 사용이 가능
 */
class AbstractFactoryTest {

    @Test
    fun buildInfantryBarracks() {
        print("what was built? : ${HQ().buildBarracks().build(InfantryUnits.RIFLEMAN)}")
    }
}
