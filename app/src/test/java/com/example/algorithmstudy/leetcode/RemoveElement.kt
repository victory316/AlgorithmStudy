package com.example.algorithmstudy.leetcode

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val numsList = nums.toMutableList()

        numsList.removeIf { it == `val`}

        nums.forEachIndexed { index, i ->
            nums[index] = 0
        }

        numsList.forEachIndexed { index, i ->
            nums[index] = i
        }

        return numsList.size
    }
}