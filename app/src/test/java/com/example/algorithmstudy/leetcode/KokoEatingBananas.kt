package com.example.algorithmstudy.leetcode

class KokoEatingBananas {

    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        val sum = piles.sum()

        return sum / h
    }
}