import com.example.algorithmstudy.leetcode.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var totalNodeCount = 0
        var nodeIndex = head
        val nodeList: MutableList<ListNode> = mutableListOf()

        while (nodeIndex?.next != null) {
            nodeList.add(
                ListNode(nodeIndex.`val`)
            )
            totalNodeCount++
            nodeIndex = nodeIndex.next
        }

        if (nodeIndex != null) {
            totalNodeCount++
            nodeList.add(nodeIndex)
        }

        nodeList.removeAt(totalNodeCount - n)

        var returnNode: ListNode? = nodeList.firstOrNull()

        nodeList.removeFirstOrNull()

        while (nodeList.isNotEmpty()) {
            println(nodeList.first().`val`)
            getLastNode(returnNode)?.next = ListNode(nodeList.first().`val`)
            nodeList.removeFirst()
            // println(nodeList.size)
        }

        return returnNode
    }

    tailrec fun getLastNode(node: ListNode?): ListNode? {
        return if (node?.next != null) {
            getLastNode(node.next)
        } else node
    }
}