package com.example.algorithmstudy.leetcode

import org.junit.Test
import java.util.Stack

class DecodeString {
    fun decodeString(s: String): String {
        val braceStack = Stack<Char>()
        var answer = ""

        s.toCharArray().reversedArray().toList().forEach {
            answer += getStringWhileNoBrace(braceStack, it)
        }

        return answer
    }

    tailrec fun getStringWhileNoBrace(braceStack: Stack<Char>, char: Char): String {
        return if (braceStack.isEmpty()) {
            char.toString()
        } else {
            getStringWhileNoBrace(braceStack, char)
        }
    }

    @Test
    fun TestDecodeString() {
        val input = "3[a]2[bc]"
        println(decodeString(input))
        assert(input == "aaabcbc")
    }
}