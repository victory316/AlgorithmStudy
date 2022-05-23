package com.example.algorithmstudy.pattern.behavoiral.state

object Wait : CookingStatus {
    override val name = "Waiting"

    override fun foward(cooking: Cooking): String {
        cooking.status = Preparing
        return cooking.status.name
    }

    override fun backward(cooking: Cooking): String {
        return "이전 상태 없음"
    }
}
