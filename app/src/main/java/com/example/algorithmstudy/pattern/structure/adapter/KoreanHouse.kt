package com.example.algorithmstudy.pattern.structure.adapter

class KoreanHouse {
    fun plugAndTurnOn(device: KoreaPlug) {
        println("$device was plugged on Korean House")
        (device as? Device)?.powerOn()
    }
}
