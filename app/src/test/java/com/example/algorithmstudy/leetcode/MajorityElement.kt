package com.example.algorithmstudy.leetcode

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        var map = mutableMapOf<Int, Int?>()

        nums.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        val sorted = map.toList().sortedByDescending { it.second }

        return sorted.first().first
    }
}