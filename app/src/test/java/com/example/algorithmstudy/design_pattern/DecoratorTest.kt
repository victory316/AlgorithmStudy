package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.decorator.BubbleLights
import com.example.algorithmstudy.pattern.structure.decorator.PineChristmasTree
import org.junit.Test

/**
 *  Decorator Pattern
 *
 *  - 특정 인터페이스를 따르는 클래스를 변형하지 않으면서 별도의 Decorator 클래스를 사용해 값을 변경할 수 있다.
 *  - 반환값 이외에도 다른 형을 가진 클래스들을 조합해 사용하는데 유용하게 쓸 수 있는 패턴.
 */
class DecoratorTest {

    @Test
    fun testDecorator() {
        val shinyTree = PineChristmasTree()
        println(BubbleLights(shinyTree).decorate())
    }
}
