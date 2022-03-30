package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.decorator.BubbleLights
import com.example.algorithmstudy.pattern.structure.decorator.PineChristmasTree
import org.junit.Test

class DecoratorTest {

    @Test
    fun testDecorator() {
        val shinyTree = PineChristmasTree()
        println(BubbleLights(shinyTree).decorate())
    }
}
