package com.example.algorithmstudy.leetcode

class Permute {

    private var result = mutableListOf<List<Int>>()
    private var temp = mutableListOf<Int>()

    fun permute(nums: IntArray): List<List<Int>> {
        backtrack(nums, 0)

        return result.toMutableList()
    }

    fun backtrack(nums: IntArray, index: Int) {
        if (temp.size == nums.size) {
            result.add(temp)
            temp.clear()
            return
        }

        for (i in index..nums.lastIndex) {
            temp.add(nums[index])
            backtrack(nums, index + 1)
        }
    }
}