package com.example.algorithmstudy.pattern.behavoiral.command

class UniversalFiringSystem {
    fun getActiveWeapon(): ConsumerWeapon {
        return CruiseMissile()
    }
}
