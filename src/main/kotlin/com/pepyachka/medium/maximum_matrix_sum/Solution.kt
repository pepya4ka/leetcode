package com.pepyachka.medium.maximum_matrix_sum

import kotlin.math.abs

class Solution {
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        val intList = matrix.flatMap { it.toList() }
        val parityOfTheNumberOfNegativeNumbers = if (intList.count { it < 0 } % 2 == 0) 0 else 2
        val minAbsElement = abs(intList.minOf { abs(it) })
        val sumOfAbs = intList.sumOf { abs(it) }

        return (sumOfAbs - minAbsElement * parityOfTheNumberOfNegativeNumbers).toLong()
    }
}