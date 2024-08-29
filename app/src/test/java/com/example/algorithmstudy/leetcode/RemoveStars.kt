package com.example.algorithmstudy.leetcode

import org.junit.Test
import java.util.Stack

class RemoveStars {
    fun removeStars(s: String): String {
        val starStack: Stack<Char> = Stack()

        s.forEach {
            if (it == '*') {
                starStack.pop()
            } else {
                starStack.push(it)
            }
        }

        return starStack.joinToString("")
    }

    @Test
    fun testRemoveStars() {
        assert(removeStars("leet**cod*e") == "lecoe")
    }
}