package com.example.algorithmstudy.kotlin

class MinDivider {

    fun solution(n: Int, m: Int): IntArray {
        val answer = intArrayOf(0, 0)
        var counter = 1

        val big: Int
        val small: Int

        if (n >= m) {
            big = n
            small = m
        } else {
            big = m
            small = n
        }


        // 최소공배수 판별
        if (big % small == 0) {
            answer[1] = m
        } else {
            answer[1] = big * small
        }

        // 최대공약수 판별
        if (big % small == 0) {
            answer[0] = small
        } else {
            answer[0] = 1
        }

        return answer
    }
}