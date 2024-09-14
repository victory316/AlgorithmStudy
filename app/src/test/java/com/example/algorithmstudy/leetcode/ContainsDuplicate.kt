package com.example.algorithmstudy.leetcode

class ContainsDuplicate {
    fun lengthOfLastWord(s: String): Int {
        return s.split(" ")
            .filter { it.isNotEmpty() }
            .last().length
    }
}