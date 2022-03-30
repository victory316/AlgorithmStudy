package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.adapter.LgSpeaker
import com.example.algorithmstudy.pattern.structure.adapter.SamsungSpeaker
import org.junit.Test

/**
 *  Adapter Pattern
 *
 *  - 다른 동작 방식을 가진 클래스들을 제어하는데 유용한 패턴
 */
class AdapterTest {

    @Test
    fun testAdapter() {
        val speakers = listOf(LgSpeaker(), SamsungSpeaker())
        // Connect Different speakers
        speakers.forEach {
            it.connect()
        }
        speakers.forEach {
            it.disconnect()
        }
    }
}
