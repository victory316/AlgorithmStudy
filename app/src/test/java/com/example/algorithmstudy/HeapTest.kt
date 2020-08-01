package com.example.algorithmstudy

import com.example.algorithmstudy.java.PriorityQueueUtil
import org.junit.Test

class HeapTest {

    @Test
    fun doSkovile() {
        println(PriorityQueueUtil().doSkovile(intArrayOf(1, 2, 3, 9, 10, 12), 7))
        println(PriorityQueueUtil().doSkovile(intArrayOf(1, 2, 3, 9, 10, 12), 200))
    }
}