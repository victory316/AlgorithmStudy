package com.example.algorithmstudy.pattern

import kotlin.properties.Delegates

/**
 * Builder 패턴 (Creational pattern)
 *
 *  https://blog.mindorks.com/mastering-design-patterns-in-android-with-kotlin
 */
class Car(builder: Builder) {
    private val company = builder.company
    private val wheels = builder.wheels
    private val engine = builder.engine
    private val sunroof = builder.sunroof

    fun getCompany() = company
    fun getWheels() = wheels
    fun getEngine() = engine
    fun getSunroof() = sunroof

    class Builder(company: String) {

        // 필수
        var company: String = company

        // Optional : 추가 조건이 아닌 가변 조건임을 뜻함.
        var wheels = 0
        var engine = ""
        var sunroof = false

        fun setWheels(wheels: Int): Builder {
            this.wheels = wheels
            return this
        }

        fun setEngine(engine: String): Builder {
            this.engine = engine
            return this
        }

        fun setSunroof(sunroof: Boolean): Builder {
            this.sunroof = sunroof
            return this
        }

        fun create(): Car {
            return Car(this)
        }
    }
}