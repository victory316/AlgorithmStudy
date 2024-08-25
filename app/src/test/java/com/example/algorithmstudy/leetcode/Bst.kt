package com.example.algorithmstudy.leetcode

class Bst {

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var current = root

        while (true) {
            if (current?.`val` == `val` || current?.`val` == null) {
                break
            } else if (((current?.`val`) ?: 0) > `val`) {
                current = current?.left
            } else {
                current = current?.right
            }
        }
        return current
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
