package com.example.algorithmstudy.pattern.behavoiral.iterator

class FoodIterator(private val collection: List<Food>) : Iterator<Food> {
    private var index = 0

    override fun next(): Food {
        return collection[index++]
    }

    override fun hasNext(): Boolean {
        return index < collection.size
    }
}
