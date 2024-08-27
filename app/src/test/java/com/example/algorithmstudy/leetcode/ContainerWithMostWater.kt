package com.example.algorithmstudy.leetcode

import kotlin.math.max

class Solution {
    fun maxArea(height: IntArray): Int {
        var maxLeft = Pair(0, 0)
        var maxRight = Pair(0, 0)

        height.toList().reversed().forEachIndexed { index, i ->
            if (maxLeft.second < i) {
                maxLeft = Pair(index, i)
            }
        }

        height.toList().forEachIndexed { index, i ->
            if (maxRight.second < i) {
                maxRight = Pair(index, i)
            }
        }

        val maxWaterHeight = Math.max(maxLeft.second, maxRight.second)

        return maxWaterHeight * (maxRight.first - maxLeft.first)
    }
}