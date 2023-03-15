package com.pepyachka.medium.recover_binary_search_tree

import java.util.*

class Solution {
    fun recoverTree(root: TreeNode?): Unit  {//chatGRT
        var prev: TreeNode? = null
        var big: TreeNode? = null
        var small: TreeNode? = null
        val stack = Stack<TreeNode>()
        var node = root

        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node)
                node = node.left
            }

            node = stack.pop()

            if (prev != null && node.`val` < prev.`val`) {
                if (big == null) {
                    big = prev
                }
                small = node
            }
            prev = node
            node = node.right
        }

        big!!.`val` = big.`val` xor small!!.`val`
        small.`val` = big.`val` xor small.`val`
        big.`val` = big.`val` xor small.`val`
    }
}