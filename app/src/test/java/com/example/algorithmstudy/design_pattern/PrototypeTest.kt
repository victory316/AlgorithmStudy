package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.creation.prototype.MyComputer
import org.junit.Test

class PrototypeTest {

    @Test
    fun testPrototype() {
        val myOriginalPc = MyComputer(
            motherBoard = "Asus",
            cpu = "Intel",
            ram = "8GB",
            graphicCard = "Nvidia"
        )

        println(myOriginalPc)
        println(myOriginalPc.copy(graphicCard = "Rygen"))

    }
}