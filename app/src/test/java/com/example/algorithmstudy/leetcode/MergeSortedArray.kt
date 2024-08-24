package com.example.algorithmstudy.leetcode

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val sums: MutableList<Int> = mutableListOf()

        for (i in 0..<m) {
            sums.add(nums1[i])
        }

        for (i in 0..<n) {
            sums.add(nums2[i])
        }

        sums.sort()

        println(sums)

        for (i in 0..<(m+n)) {
            nums1[i] = sums[i]
        }
    }
}