package com.pepyachka.medium.sum_of_mutated_array_closest_to_target

import kotlin.math.abs

class Solution {
    fun findBestValue(arr: IntArray, target: Int): Int {
        var diff = Int.MAX_VALUE
        var t = target / arr.size - 1

        while (true) {
            val res = arr.filter { it < t }
                .let { it.sum() + t * (arr.size - it.size) }
            val abs = abs(target - res)

            if (abs < diff) {
                diff = abs
            } else {
                break
            }
            t++
        }
        return --t
    }
}