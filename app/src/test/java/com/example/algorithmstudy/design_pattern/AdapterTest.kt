package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.adapter.*
import org.junit.Test

/**
 *  Adapter Pattern
 *
 *  - 한 클래스를 다른 클래스에서 사용 가능하도록 하는 패턴
 */
class AdapterTest {

    @Test
    fun testAdapter() {
        val koreanHouse = KoreanHouse()
        val americanTv = AmericanTv(
            powerOn = { println("power on American tv") },
            powerDown = { println("power down American tv") }
        )

        koreanHouse.plugAndTurnOn(PlugConverter().americanToKorean(americanTv))
    }
}
