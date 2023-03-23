package com.pepyachka.easy.occurrences_after_bigram

class Solution {
    fun findOcurrences(text: String, first: String, second: String): Array<String> {
        return Regex("(?<=$first\\s$second\\s)\\w+")
            .findAll(text)
            .map { it.value }
            .toList()
            .toTypedArray()
    }
}