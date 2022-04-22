package com.example.algorithmstudy.pattern.behavoiral.strategy

class Fireball : Skill {
    override fun perform(target: Int): Damage = object : Damage(2000, 0.2) {}
}
