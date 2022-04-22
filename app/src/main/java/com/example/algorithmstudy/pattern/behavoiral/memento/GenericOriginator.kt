package com.example.algorithmstudy.pattern.behavoiral.memento

/**
 *  기억하고자 하는 어느 클래스와도 사용 가능하도록 하는 GenericOriginator
 */
class GenericOriginator<T : Any> {
    var state: T? = null

    fun createMemento(): T {
        return state!!
    }

    fun setMemento(memento: T) {
        state = memento
    }
}
