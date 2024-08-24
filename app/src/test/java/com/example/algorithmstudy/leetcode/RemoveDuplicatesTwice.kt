package com.example.algorithmstudy.leetcode

class RemoveDuplicatesTwice {
    fun removeDuplicates(nums: IntArray): Int {
        var duplicateCount = 0
        var prev = nums.first()
        var reassignIndex = 0
        var indexHolded = false

        nums.forEachIndexed { index, i ->
            if (prev == i) {
                duplicateCount++

                if (duplicateCount == 3 && !indexHolded) {
                    indexHolded = true
                    reassignIndex = i
                }
            } else {
                indexHolded = false
            }

            if (!indexHolded) {
                reassignIndex++
            }

            nums[reassignIndex] = i

            prev = i
        }

        return nums.size
    }
}