package com.example.algorithmstudy.pattern.behavoiral.command

class Button(private val command: Command) {
    fun click() {
        command.execute()
    }
}
