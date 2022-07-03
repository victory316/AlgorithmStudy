package com.example.algorithmstudy.pattern.behavoiral.mediator

class ConcreteMediator : Mediator {
    override fun method(sender: Any, args: Any?) {
        when (sender) {
            is ComponentA -> println("arg from A : $args")
            is ComponentB -> println("arg from B : $args")
            is ComponentC -> println("arg from C : $args")
        }
    }
}
