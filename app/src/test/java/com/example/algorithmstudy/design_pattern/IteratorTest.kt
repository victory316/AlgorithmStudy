package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.behavoiral.iterator.Food
import com.example.algorithmstudy.pattern.behavoiral.iterator.FoodIterator
import com.example.algorithmstudy.pattern.behavoiral.strategy.Fireball
import com.example.algorithmstudy.pattern.behavoiral.strategy.Player
import com.example.algorithmstudy.pattern.behavoiral.strategy.ThunderStorm
import org.junit.Test

/**
 *  Iterator Pattern
 */
class IteratorTest {

    @Test
    fun testIterator() {
        val foodCollection = mutableListOf(Food("Apple"), Food("Banana"), Food("Kiwi"))
        val iterator = FoodIterator(foodCollection)

        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
}
