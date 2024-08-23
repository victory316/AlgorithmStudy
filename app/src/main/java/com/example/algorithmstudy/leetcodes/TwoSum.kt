package com.example.algorithmstudy.leetcodes

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sorted = nums.toList().sorted()

        sorted.forEachIndexed { aIndex, a ->
            for (bIndex in aIndex + 1..sorted.size) {
                if (a + sorted[bIndex] == target) {
                    print("a : $a b: ${sorted[bIndex]} == ${a + sorted[bIndex]}")
                    return intArrayOf(aIndex, bIndex)
                }
            }
        }

        return intArrayOf(0)
    }
}