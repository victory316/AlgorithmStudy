package com.example.algorithmstudy.pattern.creation.abstract_factory

import com.example.algorithmstudy.pattern.creation.abstract_factory.units.Rifleman
import com.example.algorithmstudy.pattern.creation.abstract_factory.units.RocketSoldier


class Barracks : Building<InfantryUnits, Unit> {
    override fun build(type: InfantryUnits): Unit {
        return when (type) {
            InfantryUnits.RIFLEMAN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}