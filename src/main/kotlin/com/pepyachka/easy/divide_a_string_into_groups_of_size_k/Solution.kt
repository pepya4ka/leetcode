package com.pepyachka.easy.divide_a_string_into_groups_of_size_k

class Solution {
    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        return s.chunked(k)
            .map {
                if (it.length != k) {
                    it.padEnd(it.length + (k - it.length), fill)
                } else {
                    it
                }
            }
            .toTypedArray()
    }
}