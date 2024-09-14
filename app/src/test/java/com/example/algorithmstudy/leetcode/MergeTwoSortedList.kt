package com.example.algorithmstudy.leetcode

import java.util.PriorityQueue

class MergeTwoSortedList {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val queue = PriorityQueue<ListNode>()
        var list1Pointer: ListNode? = list1
        var list2Pointer: ListNode? = list1

        while (list1Pointer != null) {
            queue.offer(list1Pointer)
            list1Pointer = list1Pointer.next
        }

        while (list2Pointer != null) {
            queue.offer(list2Pointer)
            list2Pointer = list2Pointer.next
        }

        var mergeNodePointer: ListNode? = queue.poll()
        val mergedNode = mergeNodePointer

        while (queue.isNotEmpty()) {
            val nextNode = queue.poll()
            mergeNodePointer?.next = nextNode
            mergeNodePointer = nextNode
        }

        return mergedNode
    }
}