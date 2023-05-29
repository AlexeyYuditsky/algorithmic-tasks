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
            this.next = ListNode(4)
        }
    }

    val list2 = ListNode(1).apply {
        this.next = ListNode(3).apply {
            this.next = ListNode(4)
        }
    }

    val res = mergeTwoLists(list1, list2)
    println(res)
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    val finalNode = ListNode(0)
    var isNotNull = false
    var currentNode: ListNode? = ListNode(0)

    while (isNotNull) {
        if (currentNode == null) isNotNull = false
        currentNode = list1?.next
    }

}

