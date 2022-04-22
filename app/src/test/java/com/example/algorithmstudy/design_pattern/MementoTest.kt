package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.behavoiral.memento.CareTaker
import com.example.algorithmstudy.pattern.behavoiral.memento.Originator
import org.junit.Test

/**
 * @reference:  https://chercher.tech/kotlin/momento-design-pattern-kotlin
 */
class MementoTest {

    @Test
    fun testMemento() {
        val originator = Originator()
        originator.state = "Ironman"
        var memento = originator.createMemento()
        val careTaker = CareTaker()
        careTaker.addMemento(memento)

        originator.state = "Captain America"
        originator.state = "Hulk"
        memento = originator.createMemento()
        careTaker.addMemento(memento)
        originator.state = "Thor"
        println("Originator Current State: " + originator.state!!)
        println("Originator restoring to previous state...")
        memento = careTaker.getMemento(1)
        originator.setMemento(memento)
        println("Originator Current State: " + originator.state!!)
        println("Again restoring to previous state...")
        memento = careTaker.getMemento(0)
        originator.setMemento(memento)
        println("Originator Current State: " + originator.state!!)
    }
}
