package com.example.algorithmstudy.pattern.behavoiral.mediator

class ComponentA(private val mediator: Mediator) {
    fun operationA() {
        mediator.method(this, "arg A")
    }
}
