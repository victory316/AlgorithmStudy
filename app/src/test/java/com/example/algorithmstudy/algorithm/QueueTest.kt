package com.example.algorithmstudy.algorithm

import com.example.algorithmstudy.java.QueueSolution
import com.example.algorithmstudy.kotlin.QueueUtil
import org.junit.Test

class QueueTest {

    @Test
    fun printTest() {
        println(
            QueueUtil()
                .getPrintOrder(intArrayOf(2,1,3,2), 2))
    }

    @Test
    fun stringTest() {
        println(QueueUtil().solution("()))((()"))
    }

    @Test
    fun supplyTest() {
        println(QueueSolution().solution(4, intArrayOf(4,10,15), intArrayOf(20, 5, 10), 30))
    }
}