package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.behavoiral.templatemethod.Americano
import com.example.algorithmstudy.pattern.behavoiral.templatemethod.OrangeAde
import org.junit.Test

/**
 *  TemplateMethod 패턴
 *
 *  - 공통된 function들은 함께 사용하되, 각 구현 요소별로 다르게 수행할 function을 각각 정의해 사용 가능한 패턴
 */
class TemplateMethodTest {

    @Test
    fun testTemplateMethod() {
        val americano = Americano()
        val orangeAde = OrangeAde()

        americano.prepareDrink()
        orangeAde.prepareDrink()
    }
}
