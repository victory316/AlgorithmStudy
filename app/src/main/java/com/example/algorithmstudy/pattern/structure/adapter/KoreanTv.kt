package com.example.algorithmstudy.pattern.structure.adapter

class KoreanTv(
    private val powerOn: () -> Unit,
    private val powerDown: () -> Unit
) : KoreaPlug, Device {
    override fun powerOn() {
        powerOn.invoke()
    }

    override fun powerDown() {
        powerDown.invoke()
    }
}
