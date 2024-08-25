package com.example.algorithmstudy.leetcode

class MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        val char1 = word1.toCharArray()
        val char2 = word2.toCharArray()

        val maxCount = if (char1.size <= char2.size) {
            char2.size
        } else {
            char1.size
        }

        var result: String = ""

        for (i in 0..<maxCount) {
            result += char1.getOrNull(i) ?: ""
            result += char2.getOrNull(i) ?: ""
        }

        return word1 + word2
    }
}