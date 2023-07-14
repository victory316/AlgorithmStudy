package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.behavoiral.strategy.Fireball
import com.example.algorithmstudy.pattern.behavoiral.strategy.Player
import com.example.algorithmstudy.pattern.behavoiral.strategy.ThunderStorm
import org.junit.Test

/**
 *  Strategy Pattern
 */
class StrategyTest {

    @Test
    fun testStrategy() {
        val player = Player()

        player.attackWithSkill(ThunderStorm(), 2)
        player.attackWithSkill(Fireball(), 1)
    }
}
