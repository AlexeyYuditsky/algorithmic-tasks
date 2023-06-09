package com.alexeyyuditsky.algorithmictasks.test

import java.util.regex.Pattern

fun main() {
    val regex = "x[0-8a-f][0-8a-f]"
    val text = "x2a"
    val matcher = Pattern.compile(regex).matcher(text)
    while (matcher.find()) {
        println(text.substring(matcher.start(), matcher.end()))
    }
}