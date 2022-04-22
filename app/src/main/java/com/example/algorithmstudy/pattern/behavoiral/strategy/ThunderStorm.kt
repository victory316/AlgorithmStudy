package com.example.algorithmstudy.pattern.behavoiral.strategy

class ThunderStorm : Skill {
    override fun perform(target: Int): Damage = object : Damage(1000, 0.3) {}
}
