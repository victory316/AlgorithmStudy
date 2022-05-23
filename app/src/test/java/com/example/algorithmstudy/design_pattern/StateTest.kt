package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.behavoiral.state.Cooking
import org.junit.Test

/**
 *  State Pattern
 *
 * @reference : https://kimchanjung.github.io/design-pattern/2020/05/26/state-pattern/
 *
 *  - 각 상태를 단계별로 체이닝해 정의함으로써 특정 개념의 전후 상태를 명확하게 정의하고 관리할 수 있음.
 *  - Client는 새로운 상태의 추가에 구애받지 않고 기존의 로직을 유지 가능
 */
class StateTest {

    @Test
    fun stateTest() {
        val cooking = Cooking()

        println(cooking.status)
        println(cooking.fowardStatus())
        println(cooking.fowardStatus())
        println(cooking.fowardStatus())
        println(cooking.fowardStatus())
        println(cooking.backwardStatus())
        println(cooking.backwardStatus())
        println(cooking.backwardStatus())
        println(cooking.backwardStatus())
    }
}
