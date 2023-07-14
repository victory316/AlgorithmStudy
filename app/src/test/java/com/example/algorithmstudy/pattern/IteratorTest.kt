package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.behavoiral.iterator.Food
import com.example.algorithmstudy.pattern.behavoiral.iterator.FoodIterator
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
