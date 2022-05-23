package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.behavoiral.visitor.Euljiro
import com.example.algorithmstudy.pattern.behavoiral.visitor.Gangnam
import com.example.algorithmstudy.pattern.behavoiral.visitor.Hongdae
import com.example.algorithmstudy.pattern.behavoiral.visitor.Traveler
import org.junit.Test

/**
 *  Visitor Pattern
 *
 *  @reference : https://chercher.tech/kotlin/visitor-design-pattern-kotlin
 *
 *  - Visitor pattern을 이용하면, 어느 클래스에서 수행하는 로직을 다른 클래스로 이전해 사용할 수 있게 된다.
 *  - 즉, 아래의 테스트에서는 각 Region에서 수행하고자 하는 로직을 Traveler 클래스 안에 정의하고 실행하도록 하는 것이다.
 */
class VisitorTest {

    @Test
    fun visitorTest() {
        val region = listOf(Gangnam(), Hongdae(), Euljiro())
        val traveler = Traveler()
        region.forEach {
            it.accept(traveler)
        }
    }
}
