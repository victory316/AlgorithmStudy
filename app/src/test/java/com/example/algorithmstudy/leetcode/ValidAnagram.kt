package com.example.algorithmstudy.leetcode

import org.junit.Test

class ValidAnagram {
    private val charMapS = mutableMapOf<Char, Int>()
    private val charMapT = mutableMapOf<Char, Int>()

    fun isAnagram(s: String, t: String): Boolean {
        s.forEach {
            charMapS[it]?.plus(1)
        }
        t.forEach{
            charMapT[it]?.plus(1)
        }

        return charMapT == charMapS
    }
    @Test
    fun TestIsAnagram() {
        isAnagram("abbbbc", "bccaaaa")
    }
}