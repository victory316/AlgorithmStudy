package com.example.algorithmstudy.pattern.creation.abstractfactory.buildings

import com.example.algorithmstudy.pattern.creation.abstractfactory.Building
import com.example.algorithmstudy.pattern.creation.abstractfactory.InfantryUnits
import com.example.algorithmstudy.pattern.creation.abstractfactory.GameUnit
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.infantry.Rifleman
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.infantry.RocketSoldier


class Barracks : Building<InfantryUnits, GameUnit> {
    override fun build(type: InfantryUnits): GameUnit {
        return when (type) {
            InfantryUnits.RIFLEMAN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}
