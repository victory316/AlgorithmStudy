package com.example.algorithmstudy.leetcode

class MergeIntervals {

    val mutableList: MutableList<List<Int>> = mutableListOf()
    var index = 0

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        while (index <= intervals.lastIndex) {
            searchIntervalWhileNotOverlapping(intervals, index)
        }

        return mutableList.map { it.toIntArray() }.toTypedArray()
    }

    private fun searchIntervalWhileNotOverlapping(intervals: Array<IntArray>, searchIndex: Int) {
        if (searchIndex == intervals.lastIndex) {
            mutableList.add(listOf(intervals[index][0], intervals[searchIndex][1]))
            index++
        } else if (intervals[index][1] <= intervals[searchIndex + 1][0]) {
            mutableList.add(listOf(intervals[index][0], intervals[searchIndex][1]))
            index++
        } else if (intervals[index][1] <= intervals[searchIndex + 1][1]) {
            searchIntervalWhileNotOverlapping(intervals, searchIndex + 1)
        } else {
            mutableList.add(listOf(intervals[index][0], intervals[searchIndex][1]))
            index++
        }
    }
}