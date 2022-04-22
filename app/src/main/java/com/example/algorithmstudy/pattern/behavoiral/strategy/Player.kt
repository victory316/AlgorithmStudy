package com.example.algorithmstudy.pattern.behavoiral.strategy

class Player {
    fun attackWithSkill(skill: Skill, target: Int) {
        skill.perform(target)

        println("$skill attack! to $target")
    }
}
