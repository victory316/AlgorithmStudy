package com.example.algorithmstudy.pattern.creation.abstractfactory

import com.example.algorithmstudy.pattern.creation.abstractfactory.buildings.Barracks

class HQ {
    private val buildings = mutableListOf<Building<*, Unit>>()

    fun buildBarracks(): Barracks {
        val b = Barracks()
        buildings.add(b)
        return b
    }
}
