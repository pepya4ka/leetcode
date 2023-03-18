package com.pepyachka.easy.largest_local_values_in_a_matrix

class Solution {
    fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
        val res = Array(grid.size - 2) { IntArray(grid.size - 2) }

        for (i in 0..(grid.size - 3)) {
            val ints = IntArray(grid.size - 2)
            for (j in 0..(grid.size - 3)) {
                var max = 0
                for (ni in 0..2) {
                    for (nj in 0..2) {
                        if (grid[i + ni][j + nj] > max) max = grid[i + ni][j + nj]
                    }
                }
                ints[j] = max
            }
            res[i] = ints
        }
        return res
    }
}