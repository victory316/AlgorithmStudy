import java.util.PriorityQueue

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class MergeList {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

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
            queue
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