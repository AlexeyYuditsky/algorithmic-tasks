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

    var currentNode1 = list1 ?: return null
    var currentNode2 = list2 ?: return null

    val array = mutableListOf<Int>()

    while (true) {
        array.add(currentNode1.`val`)
        if (currentNode1.next == null) break
        currentNode1 = currentNode1.next!!
    }

    while (true) {
        array.add(currentNode2.`val`)
        if (currentNode2.next == null) break
        currentNode2 = currentNode2.next!!
    }

    array.sort()
    println(array)


    val arrays = mutableListOf<ListNode>()

    for (value in array) {
        arrays.add(ListNode(value))
    }

    val listNode = ListNode(array[0])

    listNode.next = arrays[1]
    listNode.next!!.next = arrays[2]
    listNode.next!!.next!!.next = arrays[3]
    listNode.next!!.next!!.next!!.next = arrays[4]
    listNode.next!!.next!!.next!!.next!!.next = arrays[5]

    return listNode
}

