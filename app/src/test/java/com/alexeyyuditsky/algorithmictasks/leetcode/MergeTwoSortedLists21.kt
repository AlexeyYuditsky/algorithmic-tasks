package com.alexeyyuditsky.algorithmictasks.leetcode

import org.junit.Test

import org.junit.Assert.*

class MergeTwoSortedLists21 {

    @Test
    fun test_1() {
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

        val finalList = ListNode(1).apply {
            this.next = ListNode(1).apply {
                this.next = ListNode(2).apply {
                    this.next = ListNode(3).apply {
                        this.next = ListNode(4).apply {
                            this.next = ListNode(4)
                        }
                    }
                }
            }
        }

        val actual = mergeTwoLists(list1, list2)
        val expected = finalList

        assertEquals(expected, actual)
    }

}