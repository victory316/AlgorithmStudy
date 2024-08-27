package com.example.algorithmstudy.leetcode

import org.junit.Test
import java.util.LinkedList
import java.util.Stack

class ReverseLinkedLists {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun reverseList(head: ListNode?): ListNode? {

        val nodeStack: Stack<Int> = Stack()
        var currentNode: ListNode? = head

        while (true) {
            nodeStack.push(currentNode?.`val`)
            currentNode = currentNode?.next

            if (currentNode?.next == null) break
        }

        var newListNode: ListNode? = null
        var currentNewListPointer: ListNode? = null

        while (nodeStack.isNotEmpty()) {
            if (currentNewListPointer == null && nodeStack.peek() != null) {
                newListNode = ListNode(nodeStack.pop())
                currentNewListPointer = newListNode
            } else if (nodeStack.peek() != null) {
                ListNode(nodeStack.pop()).let {
                    currentNewListPointer?.next = it
                    currentNewListPointer = it
                }
            }
        }

        return newListNode
    }

    @Test
    fun TestReversedLinkedList() {
        val testNode = ListNode(2).apply {
            next = ListNode(1)
        }

        reverseList(testNode)
    }


    @Test
    fun TestReversedLinkedListEmpty() {
        val testNode = ListNode(2)

        reverseList(testNode)
    }

}
