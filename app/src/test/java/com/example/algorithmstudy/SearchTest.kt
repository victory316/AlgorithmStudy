package com.example.algorithmstudy

import com.example.algorithmstudy.kotlin.SearchUtil
import org.junit.Test

class SearchTest {

    @Test
    fun testStudents() {
        SearchUtil()
            .solution(intArrayOf(1,2,3,4,5,1,2,3,4,5))
    }

    @Test
    fun testCarpet() {
        SearchUtil().doCarpet(14, 4).forEach {
            println(it)
        }
    }
}