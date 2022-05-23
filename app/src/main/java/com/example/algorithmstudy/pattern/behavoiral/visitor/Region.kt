package com.example.algorithmstudy.pattern.behavoiral.visitor

interface Region {
    fun accept(visitor: RegionVisitor)
}
