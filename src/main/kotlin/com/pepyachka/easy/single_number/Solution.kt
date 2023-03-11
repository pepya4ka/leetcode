package com.pepyachka.easy.single_number

class Solution {
    fun singleNumber(nums: IntArray): Int = nums.reduce { a, i -> a xor i }
}