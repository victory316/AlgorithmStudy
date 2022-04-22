package com.example.algorithmstudy.pattern.behavoiral.memento

/**
 *  Generic 타입을 사용함과 동시에 패턴의 취지를 유지하며, 사용 방식을 보다 일원화 하도록 하는 Manager object
 */
object MementoManager {
    private val originator = GenericOriginator<Memento>()
    private val careTaker = GenericCareTaker<Memento>()

    // state를 설정함과 동시에 Memento를 생성, careTaker에 추가
    fun setState(memento: Memento) {
        originator.state = memento
        careTaker.addMemento(originator.createMemento())
    }

    fun getState(index: Int): Memento {
        return careTaker.getMemento(index)
    }
}
