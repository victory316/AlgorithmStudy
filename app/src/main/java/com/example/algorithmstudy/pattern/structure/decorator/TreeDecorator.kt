package com.example.algorithmstudy.pattern.structure.decorator

abstract class TreeDecorator(private val tree: ChristmasTree) : ChristmasTree {
    override fun decorate(): String {
        return tree.decorate()
    }
}
