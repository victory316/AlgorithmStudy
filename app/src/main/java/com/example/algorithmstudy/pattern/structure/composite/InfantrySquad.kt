package com.example.algorithmstudy.pattern.structure.composite

class InfantrySquad(val units: MutableList<InfantryUnit> = mutableListOf()) {

    constructor(vararg units: InfantryUnit) : this(mutableListOf()) {
        units.forEach {
            this.units.add(it)
        }
    }
}
