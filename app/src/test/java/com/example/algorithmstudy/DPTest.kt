package com.example.algorithmstudy

import com.example.algorithmstudy.java.DPJava
import org.junit.Test

class DPTest {

    @Test
    fun testTriangle() {
        println(
            DPJava().solution(
                arrayOf(
                    intArrayOf(5),
                    intArrayOf(7),
                    intArrayOf(3, 8),
                    intArrayOf(8, 1, 0),
                    intArrayOf(2, 7, 4, 4),
                    intArrayOf(4, 5, 2, 6, 5)
                )
            )
        )
    }
}