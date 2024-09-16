package com.example.algorithmstudy.leetcode

import java.util.LinkedList
import java.util.Queue

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        val charQueue: Queue<Int> = LinkedList()

        s.forEach {
            charQueue.offer(it)
        }

        s.forEachIndexed { i, index ->
            s[i] = charQueue.poll()
        }
    }
}