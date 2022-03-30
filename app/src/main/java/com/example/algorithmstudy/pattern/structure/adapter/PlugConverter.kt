package com.example.algorithmstudy.pattern.structure.adapter

class PlugConverter {

    fun koreanToAmerican(device: Device): AmericanPlug {
        return AmericanTv(
            powerOn = { device.powerOn() },
            powerDown = { device.powerDown() }
        )
    }

    fun americanToKorean(device: Device): KoreaPlug {
        return KoreanTv(
            powerOn = { device.powerOn() },
            powerDown = { device.powerDown() }
        )
    }
}
