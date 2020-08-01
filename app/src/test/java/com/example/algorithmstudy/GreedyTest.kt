package com.example.algorithmstudy

import org.junit.Test

class GreedyTest {

    @Test
    fun getCoinTest() {
        println(Greedy().getMinimumCoins(4720, listOf(500 , 100, 50, 1)))
    }
}