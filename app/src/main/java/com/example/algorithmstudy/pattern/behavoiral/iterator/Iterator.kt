package com.example.algorithmstudy.pattern.behavoiral.iterator

interface Iterator<T : Any> {
    fun next(): T
    fun hasNext(): Boolean
}
