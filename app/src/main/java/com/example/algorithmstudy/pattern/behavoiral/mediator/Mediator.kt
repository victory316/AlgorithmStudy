package com.example.algorithmstudy.pattern.behavoiral.mediator

/**
 *  ref : https://asvid.github.io/kotlin_mediator_pattern
 */
interface Mediator {
    fun method(sender: Any, args: Any? = null)
}
