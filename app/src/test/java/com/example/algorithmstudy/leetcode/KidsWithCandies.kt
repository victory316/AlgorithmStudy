package com.example.algorithmstudy.leetcode

class KidsWithCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val maxCandy = candies.max()

        return candies.map {
            it + extraCandies >= maxCandy
        }
    }
}