package com.pepyachka.easy.minimum_subsequence_in_non_increasing_order

class Solution {
    fun minSubsequence(nums: IntArray): List<Int> {
        val res = mutableListOf<Int>()
        var sumArray = nums.sum()
        var sumRes = 0
        nums.sortDescending()
        var i = 0
        while (sumRes <= sumArray) {
            res.add(nums[i])
            sumRes += nums[i]
            sumArray -= nums[i]
            nums[i] = 0
            i++
        }
        return res
    }
}