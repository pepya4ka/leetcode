package com.pepyachka.easy.minimum_subsequence_in_non_increasing_order

class Solution {
    fun minSubsequence(nums: IntArray): List<Int> {
        val res = mutableListOf<Int>()
        nums.sortDescending()
        var i = 0
        while (res.sum() <= nums.sum()) {
            res.add(nums[i])
            nums[i] = 0
            i++
        }
        return res
    }
}