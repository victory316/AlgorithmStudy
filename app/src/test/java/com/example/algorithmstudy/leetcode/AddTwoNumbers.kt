package com.example.algorithmstudy.leetcode

import com.example.algorithmstudy.kotlin.SortUtil
import org.junit.Test

class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return ListNode(1)
    }

    @Test
    fun testOutput() {
       val result =  addTwoNumbers(ListNode(1), ListNode(2))

        println(result?.`val`)
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
