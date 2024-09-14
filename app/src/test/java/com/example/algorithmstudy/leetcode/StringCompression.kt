package com.example.algorithmstudy.leetcode

import org.junit.Test

/**
 *  미해결
 */
class StringCompression {

    fun compress(chars: CharArray): Int {
        val map = mutableMapOf<Char, Int>()

        chars.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        return map.size * 2
    }
}