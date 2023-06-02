package com.alexeyyuditsky.algorithmictasks.leetcode

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * */
data class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "(head:$`val`, next: $next)"
    }
}

fun main() {
    val list1 = ListNode(1).apply {
        this.next = ListNode(2).apply {
        }
    }

    val list2 = ListNode(1)

    val res = mergeTwoLists(list1, list2)
    println(res)
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1

    val resultNode = ListNode(0)
    if (list1.`val` <= list2.`val`) {
        resultNode.`val` = list1.`val`
        resultNode.next = mergeTwoLists(list1.next, list2)
    } else {
        resultNode.`val` = list2.`val`
        resultNode.next = mergeTwoLists(list1, list2.next)
    }

    return resultNode
}