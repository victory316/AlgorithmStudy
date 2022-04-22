package com.example.algorithmstudy.pattern.behavoiral.memento

/**
 * caretaker : the object that keeps track of multiple memento. Like maintaining save points.
 */
class CareTaker {
    private val stateList = mutableListOf<Memento>()

    fun addMemento(memento: Memento) {
        stateList.add(memento)
    }

    fun getMemento(index: Int): Memento {
        return stateList[index]
    }
}
