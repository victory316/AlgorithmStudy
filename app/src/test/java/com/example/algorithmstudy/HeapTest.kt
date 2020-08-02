package com.example.algorithmstudy

import com.example.algorithmstudy.java.PriorityQueueUtil
import org.junit.Test

class HeapTest {

    @Test
    fun doSkovile() {
        println(PriorityQueueUtil().doSkovile(intArrayOf(1, 2, 3, 9, 10, 12), 7))
        println(PriorityQueueUtil().doSkovile(intArrayOf(1, 2, 3, 9, 10, 12), 200))
    }

    @Test
    fun testHeap() {
        with (HeapUtil()) {
            this.setupHeap(15)
            this.insert(10)
            this.insert(8)
            this.insert(5)
            this.insert(4)
            this.insert(20)

            this.getHeap().forEach {
                println(it)
            }

            println("popping " + this.pop())

            println()

            this.getHeap().forEach {
                println(it)
            }
        }
    }
}