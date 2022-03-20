package com.example.algorithmstudy.pattern.creation.abstract_factory

class HQ {
    private val buildings = mutableListOf<Building<*, Unit>>()

    fun buildBarracks(): Barracks {
        val b = Barracks()
        buildings.add(b)
        return b
    }
}