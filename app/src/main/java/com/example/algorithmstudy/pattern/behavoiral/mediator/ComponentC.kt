package com.example.algorithmstudy.pattern.behavoiral.mediator

class ComponentC(private val mediator: Mediator) {
    fun operationC() {
        mediator.method(this, "arg C")
    }
}
