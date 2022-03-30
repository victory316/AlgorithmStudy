package com.example.algorithmstudy.pattern.creation.abstractfactory

import com.example.algorithmstudy.pattern.creation.abstractfactory.units.Rifleman
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.RocketSoldier


class Barracks : Building<InfantryUnits, Unit> {
    override fun build(type: InfantryUnits): Unit {
        return when (type) {
            InfantryUnits.RIFLEMAN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}
