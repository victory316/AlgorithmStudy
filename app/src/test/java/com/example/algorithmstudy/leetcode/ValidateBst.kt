package com.example.algorithmstudy.leetcode

class ValidateBst {

    fun isValidBST(root: TreeNode?): Boolean {
        return checkBst(root)
    }

    fun checkBst(root: TreeNode?): Boolean{
        if (root == null) return true

        if (root.left == null) return true
        if (root.right == null) return true

        if (root.`val` < root.left!!.`val` && root.`val` < root.right!!.`val`) {
            return true
        } else if (root.`val` < root.left!!.`val`) {
            return false
        } else if (root.`val` < root.right!!.`val`) {
            return false
        }

        return checkBst(root.left) && checkBst(root.right)
    }
}