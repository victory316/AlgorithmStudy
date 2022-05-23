package com.example.algorithmstudy.pattern.behavoiral.visitor

class Hongdae : Region {
    override fun accept(visitor: RegionVisitor) = visitor.visit(region = this)
}
