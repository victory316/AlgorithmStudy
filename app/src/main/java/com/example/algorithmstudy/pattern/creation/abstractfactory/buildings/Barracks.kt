package com.example.algorithmstudy.pattern.creation.abstractfactory.buildings

import com.example.algorithmstudy.pattern.creation.abstractfactory.Building
import com.example.algorithmstudy.pattern.creation.abstractfactory.InfantryUnits
import com.example.algorithmstudy.pattern.creation.abstractfactory.Unit
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.infantry.Rifleman
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.infantry.RocketSoldier


class Barracks : Building<InfantryUnits, Unit> {
    override fun build(type: InfantryUnits): Unit {
        return when (type) {
            InfantryUnits.RIFLEMAN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}
