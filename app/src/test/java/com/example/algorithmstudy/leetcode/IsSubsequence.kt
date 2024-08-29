package com.example.algorithmstudy.leetcode

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true

        val sCharArray = s.toMutableList()

        t.forEach {
            if (it == sCharArray.firstOrNull()) {
                sCharArray.removeAt(0)
            }
        }

        return sCharArray.isEmpty()
    }
}