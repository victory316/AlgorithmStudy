package com.example.algorithmstudy.pattern.behavoiral.visitor

class Euljiro : Region {
    override fun accept(visitor: RegionVisitor) = visitor.visit(region = this)
}
