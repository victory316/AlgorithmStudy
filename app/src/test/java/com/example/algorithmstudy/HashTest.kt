package com.example.algorithmstudy

import com.example.algorithmstudy.kotlin.HashUtil
import org.junit.Test

class HashTest {

    @Test
    fun clothesTest() {
        HashUtil().solution(arrayOf(
            arrayOf("yellow_hat", "headgear"),
            arrayOf("blue_sunglasses", "eyewear"),
            arrayOf("green_turban", "headgear"))).let {

            println(it)
        }
    }
}