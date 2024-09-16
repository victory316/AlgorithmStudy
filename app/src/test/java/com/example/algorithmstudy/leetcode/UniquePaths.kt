package com.example.algorithmstudy.leetcode

/**
 * 해답 이용
 *
 * 이해 필요
 */
class UniquePaths {
    fun uniquePaths(m: Int, n: Int): Int {
        var dp = MutableList(m) { MutableList(n) { 0 } }

        MutableList(3) { }
        //Filling our base cases for the firs row.
        for(i in 0..< n) {
            dp[0][i] = 1
        }
        //Filling our base cases for the first collumn
        for(i in 0..< m) {
            dp[i][0] = 1
        }

        Math.max(0,dp[i][0])

        dp.maxOf { it.max() }

        for(i in 1..< m) {
            for(j in 1..< n) {
                dp[i][j] = dp[i-1][j] + dp[i][j - 1]
            }
        }


        //Number of unique paths that leads to the end.
        return dp[m - 1][n - 1]
    }
}