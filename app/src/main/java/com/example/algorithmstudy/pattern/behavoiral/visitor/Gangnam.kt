package com.example.algorithmstudy.pattern.behavoiral.visitor

class Gangnam : Region {
    override fun accept(visitor: RegionVisitor) = visitor.visit(region = this)
}
