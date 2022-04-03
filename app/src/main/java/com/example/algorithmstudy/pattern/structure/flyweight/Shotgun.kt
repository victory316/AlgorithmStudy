package com.example.algorithmstudy.pattern.structure.flyweight

class Shotgun : Weapon {
    override fun fire() {
        println("fire $this")
    }

    override fun reload() {
        println("reload $this")
    }

    override fun fix() {
        println("fix $this")
    }
}
