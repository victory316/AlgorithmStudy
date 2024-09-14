package com.example.algorithmstudy.leetcode

import org.junit.Test
import java.util.PriorityQueue

class SortList {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun sortList(head: ListNode?): ListNode? {
        val queue = PriorityQueue<ListNode>()
        var pointer: ListNode? = head

        while (pointer != null) {
            queue.offer(pointer)
            pointer = pointer.next
        }

        return null
    }

    @Test
    fun testSortList() {
        sortList(ListNode(1))
    }
}