package com.example.algorithmstudy.pattern.behavoiral.state

object Preparing : CookingStatus {
    override val name = "Preparing"

    override fun foward(cooking: Cooking): String {
        cooking.status = OnCook
        return cooking.status.name
    }

    override fun backward(cooking: Cooking): String {
        cooking.status = Wait
        return cooking.status.name
    }
}
