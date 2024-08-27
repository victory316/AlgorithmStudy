package com.example.algorithmstudy.leetcode

class DeleteNode {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        var indexNode: TreeNode? = root
        var prevNode: TreeNode? = null

        while (true) {
            if (indexNode?.`val` == key) {

            }
            if ((indexNode?.`val` ?: 0) < key) {
                prevNode = indexNode
            } else {
                prevNode = indexNode
            }
        }
    }
}