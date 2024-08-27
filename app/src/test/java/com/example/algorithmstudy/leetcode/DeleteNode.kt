package com.example.algorithmstudy.leetcode

class DeleteNode {

    enum class LastDirection {
        LEFT,
        RIGHT
    }

    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        var indexNode: TreeNode? = root
        var prevNode: TreeNode? = null
        var lastDirection : LastDirection = LastDirection.LEFT

        while (true) {
            if (indexNode.`val` == key) {
                if (lastDirection == LastDirection.LEFT) {
                    prevNode.left
                }
            }
            if (indexNode.`val` < key) {
                prevNode = indexNode
                indexNode = indexNode.right
                lastDirection = LastDirection.RIGHT
            } else {
                prevNode = indexNode
                indexNode = indexNode.left
                lastDirection = LastDirection.LEFT
            }
        }
    }
}