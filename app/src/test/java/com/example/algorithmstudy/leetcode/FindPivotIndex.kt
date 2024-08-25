package com.example.algorithmstudy.leetcode

class FindPivotIndex {

    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = 0
        var result = -1
        var hasResult = false

        nums.forEachIndexed { index, i ->
            leftSum += nums[index]
            rightSum += nums[nums.lastIndex - index]

            if (leftSum == rightSum && !hasResult) {
                result = index
                hasResult = true
            }
        }

        return result
    }
}