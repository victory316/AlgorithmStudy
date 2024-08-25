package com.example.algorithmstudy.leetcode

class HighestAltitude {

    fun largestAltitude(gain: IntArray): Int {
        var highest = 0
        var current = 0
        gain.forEach {
            current += it
            if (current > highest) {
                highest = current
            }
        }

        return highest
    }
}