package com.example.algorithmstudy.pattern.behavoiral.state

class Cooking {
    var status: CookingStatus = Wait

    fun fowardStatus() = status.foward(this)
    fun backwardStatus() = status.backward(this)
}
