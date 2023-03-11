package com.pepyachka.medium.integer_to_roman

class Solution {
    fun intToRoman(num: Int): String = intToRoman(num, "")

    private fun intToRoman(num: Int, res: String): String {
        if (num == 0) {
            return res
        }

        val roman = Roman.values().reversedArray().first { r -> num >= r.value }
        return intToRoman(num - roman.value, res + roman.name)
    }
}