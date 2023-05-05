package com.alexeyyuditsky.algorithmictasks.leetcode

import java.util.Stack

/**
 * https://leetcode.com/problems/valid-parentheses/
 */

fun main() {
    val res = isValid("[(()]))")
    println(res)
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    for (c in s) {
        if (c == '(' || c == '{' || c == '[') stack.push(c)
        else if (stack.isEmpty()) return false
        else if (
            c == ')' && stack.peek() == '(' ||
            c == '}' && stack.peek() == '{' ||
            c == ']' && stack.peek() == '['
        ) stack.pop()
        else return false
    }

    return stack.isEmpty()
}

fun isValid2(s: String): Boolean {
    var res = s
    var length = s.length / 2

    while (length > 0) {
        res = res.replace("()", "").replace("{}", "").replace("[]", "")
        length--
    }

    return res.isEmpty()
}