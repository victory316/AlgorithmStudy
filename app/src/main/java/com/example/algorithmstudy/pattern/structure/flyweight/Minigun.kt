package com.example.algorithmstudy.pattern.structure.flyweight

class Minigun : Weapon {
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
