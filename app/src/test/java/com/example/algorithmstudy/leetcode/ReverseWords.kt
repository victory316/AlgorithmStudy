package com.example.algorithmstudy.leetcode

import java.util.StringTokenizer

class ReverseWords {
    fun reverseWords(s: String): String {
        var tokenizedList = mutableListOf<String>()
        var tokenized = ""

        s.toCharArray().forEachIndexed { index, char ->
            if (!char.isWhitespace()) {
                tokenized += char
            } else if (tokenized.isNotEmpty()) {
                tokenizedList.add(tokenized)
                tokenized = ""
            }

            if (index == s.lastIndex && tokenized.isNotEmpty()) {
                tokenizedList.add(tokenized)
            }
        }

        val reversed = tokenizedList.reversed()

        return buildString {
            reversed.forEachIndexed { index, s ->
                append(s)

                if (index != reversed.lastIndex) {
                    append(" ")
                }
            }
        }
    }
}