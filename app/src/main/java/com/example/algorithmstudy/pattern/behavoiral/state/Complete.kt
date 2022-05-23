package com.example.algorithmstudy.pattern.behavoiral.state

object Complete : CookingStatus {
    override val name = "Complete"

    override fun foward(cooking: Cooking) = "다음 상태 없음"

    override fun backward(cooking: Cooking): String {
        cooking.status = OnCook
        return cooking.status.name
    }
}
