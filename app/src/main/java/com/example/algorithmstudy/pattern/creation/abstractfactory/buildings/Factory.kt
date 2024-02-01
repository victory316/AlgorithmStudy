package com.example.algorithmstudy.pattern.creation.abstractfactory.buildings

import com.example.algorithmstudy.pattern.creation.abstractfactory.Building
import com.example.algorithmstudy.pattern.creation.abstractfactory.MechanicUnits
import com.example.algorithmstudy.pattern.creation.abstractfactory.GameUnit
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.mechanics.SiegeTank
import com.example.algorithmstudy.pattern.creation.abstractfactory.units.mechanics.Vulture


class Factory : Building<MechanicUnits, GameUnit> {

    override fun build(type: MechanicUnits): GameUnit {
        return when (type) {
            MechanicUnits.VULTURE -> Vulture()
            MechanicUnits.SIEGE_TANK -> SiegeTank()
        }
    }
}
