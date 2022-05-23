package com.example.algorithmstudy.pattern.behavoiral.command

class CruiseMissile : ConsumerWeapon {
    override fun fire() {
        println("Firing Cruise missile")
    }

    override fun reload() {
        println("Reloading Crise missile")
    }
}
