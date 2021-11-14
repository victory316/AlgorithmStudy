package com.example.algorithmstudy

import com.example.algorithmstudy.pattern.creation.factory.Car
import org.junit.Test

class PatternTest {

    @Test
    fun testCarBuilder() {
        val myCar = Car.Builder("Hyundai")
            .setWheels(4)
            .setEngine("V6")
            .setSunroof(false)
            .create()

        println("""
                ${myCar.getCompany()}
                ${myCar.getWheels()}
                ${myCar.getEngine()}
                ${myCar.getSunroof()}
            """.trimIndent())
    }
}