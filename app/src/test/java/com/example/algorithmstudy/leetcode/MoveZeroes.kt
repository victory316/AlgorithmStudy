package com.example.algorithmstudy.leetcode

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        val intList = mutableListOf<Int>()
        val zeroList = mutableListOf<Int>()

        nums.forEach {
            if (it == 0) {
                zeroList.add(it)
            } else {
                intList.add(it)
            }
        }

        var zeroListIndex = 0
        for (i in nums.indices) {
            nums[i] = intList.getOrNull(i) ?: zeroList.get(zeroListIndex).also {
                zeroListIndex++
            }
        }
    }
}