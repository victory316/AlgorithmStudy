package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.creation.prototype.MyComputer
import org.junit.Test

/**
 *  Prototype Pattern
 *
 *  - 이미 생성된 객체의 일부를 복사해 사용하고자 하는 경우 쓰면 유용한 패턴
 */
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
