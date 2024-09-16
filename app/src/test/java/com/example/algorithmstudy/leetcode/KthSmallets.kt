package com.example.algorithmstudy.leetcode

class KthSmallets {

    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        val flattened = matrix.flatMap { it.toList() }.sorted()

        return flattened.get(8)
    }
}