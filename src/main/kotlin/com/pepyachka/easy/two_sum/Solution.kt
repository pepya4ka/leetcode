package com.pepyachka.easy.two_sum

import java.util.stream.Collectors

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val numList = nums.toMutableList() 

        for (num in numList) {
            if (target - num == target / 2) {
                val first = numList.indexOfFirst { it == target - num }
                val last = numList.indexOfLast { it == target - num }
                if (first != last) {
                    return intArrayOf(
                        first,
                        last
                    )
                }
            } else if (numList.contains(target - num)) {
                return intArrayOf(
                    numList.indexOf(num),
                    numList.indexOf(target - num)
                )
            }
        }
        return intArrayOf()
    }
}