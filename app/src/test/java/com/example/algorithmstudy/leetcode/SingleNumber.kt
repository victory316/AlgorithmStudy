package com.example.algorithmstudy.leetcode

class SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        nums.forEach {
            map[it] = map[it]?.plus(1) ?: 1
        }

        val list = map.toList()
        return list.sortedBy { it.second }
            .find { it.second == 1 }?.first ?: 0
    }
}