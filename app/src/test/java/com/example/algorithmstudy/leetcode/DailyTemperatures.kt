package com.example.algorithmstudy.leetcode

class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        temperatures.forEachIndexed { index, i ->
            temperatures.copyOfRange(index, temperatures.size).forEach {

            }
            val high = temperatures.copyOfRange(index, temperatures.lastIndex)
                .indexOfFirst { it > i }
            answer.add(
                if (high == -1) {
                    0
                } else {
                    high
                }
            )
        }

        return answer.toIntArray()
    }
}