package com.example.algorithmstudy.leetcode

import org.junit.Test

class DistictBy {
    fun closeStrings(word1: String, word2: String): Boolean {
        val charWords1 = word1.toCharArray().sorted().distinct()
        val charWords2 = word2.toCharArray().sorted().distinct()

        return charWords1 == charWords2 && word1.length == word2.length
    }

    @Test
    fun testCloseStrings() {

        assert(closeStrings("a", "aa") == false)
    }
}