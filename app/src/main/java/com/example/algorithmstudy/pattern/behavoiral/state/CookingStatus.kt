package com.example.algorithmstudy.pattern.behavoiral.state

interface CookingStatus {
    val name: String
    fun foward(cooking: Cooking): String
    fun backward(cooking: Cooking): String
}
