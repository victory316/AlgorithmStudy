package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.behavoiral.mediator.ComponentA
import com.example.algorithmstudy.pattern.behavoiral.mediator.ComponentB
import com.example.algorithmstudy.pattern.behavoiral.mediator.ComponentC
import com.example.algorithmstudy.pattern.behavoiral.mediator.ConcreteMediator
import org.junit.Test

/**
 *  Mediator Pattern
 *
 *  - 컴포넌트들은 Mediator를 reference로 가지며, 서로가 소통할 일은 없음
 *  - Mediator는 각 컴포넌트들을 판단해 각각 필요한 동작을 수행하도록 조정함(말대로 중재자)
 */
class MediatorTest {

    @Test
    fun mediatorTest() {
        ConcreteMediator().apply {
            val componentA = ComponentA(this)
            val componentB = ComponentB(this)
            val componentC = ComponentC(this)

            method(componentA)
            method(componentB)
            method(componentC)
        }
    }
}
