package com.pepyachka.easy.roman_to_integer

class Solution {

    fun romanToInt(s: String): Int {
        var inputString = s
        var res = 0
        while (inputString.isNotEmpty()) {
            Roman.values()
                .find { inputString.endsWith(it.name) }
                ?.also {
                    inputString = inputString.take(inputString.length - it.name.length)
                    res += it.value
                }
        }
        return res
    }

    fun romanToIntWithRegex(s: String): Int {
        val values = Roman.values().sortedByDescending { it.name.length }
        val regex = Regex(values.joinToString("|") { it.name })
        return regex.findAll(s)
            .map { Roman.valueOf(it.value).value }
            .sum()
    }
}
