package com.example.algorithmstudy.pattern.structure.adapter

class AmericanTv(
    private val powerOn: () -> Unit,
    private val powerDown: () -> Unit
) : AmericanPlug, Device {
    override fun powerOn() {
        powerOn.invoke()
    }

    override fun powerDown() {
        powerDown.invoke()
    }
}
