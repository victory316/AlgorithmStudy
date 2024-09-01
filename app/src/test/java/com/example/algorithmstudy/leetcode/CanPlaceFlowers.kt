package com.example.algorithmstudy.leetcode

class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var flowerRemains = n

        flowerbed.forEachIndexed { index, i ->
            val prev = if (index == 0) 0 else flowerbed[index - 1]
            val next = if (index == flowerbed.lastIndex) 0 else flowerbed[index + 1]

            if (prev == 0 && next == 0 && flowerbed[index] == 0) {
                if (flowerRemains == 0) {
                    return@forEachIndexed
                } else {
                    flowerbed[index] = 1
                    flowerRemains--
                }
            }
        }

        return flowerRemains == 0
    }
}