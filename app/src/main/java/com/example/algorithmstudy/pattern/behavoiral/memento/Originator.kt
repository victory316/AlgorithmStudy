package com.example.algorithmstudy.pattern.behavoiral.memento

/**
 * originator : the object for which the state is to be saved. It creates the memento and uses it in the future to undo.
 */
class Originator {

    var state: String? = null

    fun createMemento(): Memento {
        return Memento(state ?: "")
    }

    fun setMemento(memento: Memento) {
        state = memento.state
    }
}
