package com.pepyachka.medium.recover_binary_search_tree

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun sumWithStack(root: TreeNode): Int {

    val stack = LinkedList<TreeNode>()
    stack.addFirst(root)

    var sum = 0

    while (!stack.isEmpty()) {
        val node = stack.poll()

        println(node.`val`)
        sum += node.`val`

        if (node.right != null) {
            stack.addFirst(node.right)
        }

        if (node.left != null) {
            stack.addFirst(node.left)
        }
    }

    return sum
}

fun sumWithQueue(root: TreeNode): Int {

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    var sum = 0

    while (!queue.isEmpty()) {
        val node = queue.poll()

        println(node.`val`)
        sum += node.`val`

        if (node.left != null) {
            queue.add(node.left)
        }

        if (node.right != null) {
            queue.add(node.right)
        }
    }

    return sum
}
