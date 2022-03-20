package com.example.algorithmstudy.pattern.creation.abstract_factory

interface Building<in UnitType, out ProducedUnit>
        where UnitType : Enum<*>, ProducedUnit : Unit {

    fun build(type: UnitType): ProducedUnit
}