package com.example.algorithmstudy.leetcode

class CountingBits {

    fun countBits(n: Int): IntArray {
        val bitList = mutableListOf<Int>()

        for (i in 0..n) {
            bitList.add(i.countOneBits())
        }

        return bitList.toIntArray()
    }
}