package com.example.algorithmstudy.pattern.behavoiral.command

class GrenadeLauncher : ConsumerWeapon {
    override fun fire() {
        println("Firing Grenade Launcher")
    }

    override fun reload() {
        println("Reloading Grenade Launcher")
    }
}
