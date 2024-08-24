package com.example.algorithmstudy.leetcode

class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        val sets = mutableSetOf<Int>()

        nums.forEach {
            sets.add(it)
        }

        nums.forEachIndexed { index, i ->
            nums[index] = sets.elementAtOrNull(index) ?: 0
        }

        return sets.size
    }
}