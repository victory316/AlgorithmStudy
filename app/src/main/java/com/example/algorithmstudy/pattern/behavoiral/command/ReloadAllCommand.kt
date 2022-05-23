package com.example.algorithmstudy.pattern.behavoiral.command

class ReloadAllCommand(private val consumerWeaponList: List<ConsumerWeapon>) : Command {
    override fun execute() {
        consumerWeaponList.forEach {
            it.reload()
        }
    }
}
