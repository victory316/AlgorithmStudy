package com.example.algorithmstudy.leetcode

import org.junit.Test

class RemoveStars {

    fun removeStars(s: String): String {
        return removeWhileExists(s)
    }

    private tailrec fun removeWhileExists(target: String): String {
        var targetTemp = target
        var index = 0
        var removed = false

        while(!removed) {
            if (target.toCharArray()[index] == '*') {
                targetTemp = target.removeRange(index - 1, index + 1)
                removed = true
            }

            index++
        }

        target.toCharArray().forEachIndexed { index, c ->
            if (!removed) {
                if (c == '*') {
                    targetTemp = target.removeRange(index - 1, index + 1)
                }
                removed = true
            } else {
                return@forEachIndexed
            }
        }

        return if (target.contains('*')) {
            removeWhileExists(targetTemp)
        } else {
            target
        }
    }

    @Test
    fun testRemoveStars() {
        removeStars("leet**cod*e")
    }
}