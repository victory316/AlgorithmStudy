package com.example.algorithmstudy.pattern.behavoiral.mediator

class ComponentB(private val mediator: Mediator) {
    fun operationB() {
        mediator.method(this, "arg B")
    }
}
