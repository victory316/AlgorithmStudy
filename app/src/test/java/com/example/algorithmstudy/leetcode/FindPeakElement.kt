package com.example.algorithmstudy.leetcode

import kotlin.math.max

class FindPeakElement {
    fun findPeakElement(nums: IntArray): Int {
        var isDescending = false
        var wereDescended = false
        var lastValue: Int? = 0
        var result = 0

        if (nums.size == 1) return 0

        nums.forEachIndexed { index, i ->
            if (lastValue != null && (lastValue ?: 0) < i) {
                isDescending = true
            }

            if (isDescending && (lastValue ?: 0) > i) {
                isDescending = false
                wereDescended = true
                result = index
            }

            lastValue = i
        }

        if (isDescending) {
            return nums.lastIndex
        }
        if (!wereDescended){
            return 0
        }

        return result - 1
    }
}
