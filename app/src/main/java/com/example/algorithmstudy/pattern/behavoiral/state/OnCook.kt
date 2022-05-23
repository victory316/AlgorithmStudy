package com.example.algorithmstudy.pattern.behavoiral.state

object OnCook : CookingStatus {
    override val name = "OnCook"

    override fun foward(cooking: Cooking): String {
        cooking.status = Complete
        return cooking.status.name
    }

    override fun backward(cooking: Cooking): String {
        cooking.status = Preparing
        return cooking.status.name
    }
}
