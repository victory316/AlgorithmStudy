package com.example.algorithmstudy.leetcode

import org.junit.Test

class RemoveStars2 {

    fun removeStars(s: String): String {
        return removeWhileExists(s)
    }

    private tailrec fun removeWhileExists(target: String): String {
        var targetTemp = target
        var index = 0
        var starCount = 0
        var removeEndIndex: Int? = null
        var removed = false

        while (!removed && index <= target.lastIndex) {
            if (target[index] == '*') {
                val what = target[index]
                starCount++
                if (removeEndIndex == null) {
                    removeEndIndex = index
                }
            } else if (starCount != 0) {
                val result = target[index]
                targetTemp =
                    target.removeRange((removeEndIndex ?: 0) - starCount, (removeEndIndex ?: 0))
                removed = true
            }

            index++
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