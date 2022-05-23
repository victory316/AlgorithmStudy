package com.example.algorithmstudy.pattern.behavoiral.command

class FireCommand(private val consumerWeapon: ConsumerWeapon): Command {
    override fun execute() {
        consumerWeapon.fire()
    }
}
