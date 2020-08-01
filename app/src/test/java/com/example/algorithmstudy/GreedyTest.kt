package com.example.algorithmstudy

import org.junit.Test

class GreedyTest {

    @Test
    fun getCoinTest() {
        println(Greedy().getMinimumCoins(4720, listOf(500 , 100, 50, 1)))
    }

    @Test
    fun napsackTest() {
        Greedy().fractionalNapsack(listOf(listOf(10,10), listOf(15 ,12), listOf(20, 10),  listOf(30, 5), listOf(25, 8)), 30)
            .forEach {
                println(it)
            }
    }
}