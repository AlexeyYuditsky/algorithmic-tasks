package com.alexeyyuditsky.algorithmictasks.leetcode

import java.util.Stack

/**
 * https://leetcode.com/problems/valid-parentheses/
 */

fun main() {
    val res = isValid("(){}}{") //
    println(res)
}

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false

    val stack = Stack<Char>()

    for (c in s) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c)
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) return false
            if (c == ')' && stack.peek() == '(' ||
                c == '}' && stack.peek() == '{' ||
                c == ']' && stack.peek() == '['
            ) {
                stack.pop()
            } else {
                return false
            }
        }
    }

    return stack.isEmpty()
}