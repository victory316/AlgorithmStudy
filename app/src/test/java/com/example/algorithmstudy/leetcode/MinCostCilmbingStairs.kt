package com.example.algorithmstudy.leetcode

class MinCostCilmbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        val dp = IntArray(n + 1) { 0 }

        for (i in 2..n) {
            dp[i] = minOf(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2])
        }

        return dp[n]
    }
}