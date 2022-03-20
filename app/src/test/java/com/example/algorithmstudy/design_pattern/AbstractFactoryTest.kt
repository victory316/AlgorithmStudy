package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.creation.abstract_factory.HQ
import com.example.algorithmstudy.pattern.creation.abstract_factory.InfantryUnits
import org.junit.Test

class AbstractFactoryTest {

    @Test
    fun buildInfantryBarracks() {
        print("what was built? : ${HQ().buildBarracks().build(InfantryUnits.RIFLEMAN)}")
    }
}