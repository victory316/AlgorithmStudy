package com.example.algorithmstudy.pattern.structure.decorator

class BubbleLights(tree: ChristmasTree) : TreeDecorator(tree) {
    override fun decorate(): String {
        return super.decorate() + decorateWithBubbleLights()
    }

    private fun decorateWithBubbleLights(): String {
        return " with bubble lights"
    }
}
