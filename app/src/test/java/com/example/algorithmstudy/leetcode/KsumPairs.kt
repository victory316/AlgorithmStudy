package com.example.algorithmstudy.leetcode

class KsumPairs {

    fun maxOperations(nums: IntArray, k: Int): Int {
        var leftIndex = 0
        var rightIndex = nums.lastIndex
        var operationCount = 0

        nums.sort()

        while (leftIndex != rightIndex) {
            when {
                nums[leftIndex] + nums[rightIndex] == k -> {
                    operationCount++
                }

                nums[leftIndex] < k -> {
                    leftIndex++
                }

                else -> {
                    rightIndex--
                }
            }
        }

        return operationCount
    }
}