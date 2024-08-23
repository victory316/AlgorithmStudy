package com.example.algorithmstudy.leetcode

import org.junit.Test

class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return ListNode(1)
    }

    fun nodeToNumber(l1: ListNode?): Int {
        var result = 0
        var index: ListNode? = l1
        var increment = 1

        while (true) {
            val value = (index?.`val`) ?: 0
            result += ((value * increment))
            increment *= 10
            index = index?.next
            if (index?.next == null) break
        }

        println(result)
        return result
    }

    @Test
    fun test100Output() {
        val result = addTwoNumbers(ListNode(1), ListNode(2))

        val node2 = ListNode(3)
        val node1 = ListNode(4).apply {
            next = node2
        }
        val nodes = ListNode(2).apply {
            next = node1
        }

        nodeToNumber(nodes)
        println(result?.`val`)
    }

    @Test
    fun testOutput() {
        val result = addTwoNumbers(ListNode(1), ListNode(2))

        println(result?.`val`)
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
