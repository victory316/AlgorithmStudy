package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.structure.bridge.LgSpeaker
import com.example.algorithmstudy.pattern.structure.bridge.SamsungSpeaker
import org.junit.Test

/**
 *  Bridge Pattern
 *
 *  - 같은 행위를 수행하되, 각 클래스별로 다르게 사용해야 할 때 유용
 */
class BridgeTest {

    @Test
    fun testBridge() {
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
