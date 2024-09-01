package com.example.algorithmstudy.leetcode

class PivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var pivotFound = false
        var index = 0

        while (index <= nums.lastIndex) {
            val leftSum = nums.slice(IntRange(0, index)).sum()
            val rightSum = nums.slice(IntRange(index, nums.lastIndex)).sum()

            if (leftSum == rightSum) {
                pivotFound = true
                break
            }

            index++
        }

        return if (pivotFound) {
            index
        } else {
            -1
        }
    }
}