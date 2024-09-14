package com.example.algorithmstudy.leetcode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class PathSum {
    var hasSum = false

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        checkSum(root, targetSum)
        return hasSum
    }

    fun checkSum(root: TreeNode?, targetSum: Int): Int {
        if (root?.`val` == null && root?.`val` == null) {
            return root?.`val` ?: 0
        }

        if (checkSum(root?.left, targetSum) + root.`val` == targetSum) {
            hasSum = true
        }

        if (checkSum(root?.right, targetSum) + root.`val` == targetSum) {
            hasSum = true
        }

        return 0
    }
}