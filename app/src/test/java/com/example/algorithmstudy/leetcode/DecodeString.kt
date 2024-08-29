package com.example.algorithmstudy.leetcode

import org.junit.Test

class DecodeString {
    fun decodeString(s: String): String {


        return ""
    }

    tailrec fun findFormatted(s: String): String {
        return ""
    }

    @Test
    fun TestDecodeString() {
        val input = "3[a]2[bc]"

        assert(input == "aaabcbc")
    }

    fun closeStrings(word1: String, word2: String): Boolean {
        return countWordSet(word1).equals(countWordSet(word2))
    }

    fun countWordSet(word: String): Map<Char,Int> {
        val stringMap = mutableMapOf<Char,Int>()

        word.toCharArray().toList().forEach {
            stringMap[it] = (stringMap[it] ?: 0)+ 1
        }

        return stringMap.toSortedMap()
    }
}