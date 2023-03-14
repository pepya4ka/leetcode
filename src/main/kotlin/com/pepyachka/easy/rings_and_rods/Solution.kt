package com.pepyachka.easy.rings_and_rods

class Solution {
    fun countPoints(rings: String): Int {
        return Regex("[RGB]\\d").findAll(rings)
            .map { it.value }
            .groupBy({ Character.getNumericValue(it[1]) }, { it })
            .map { it.value.toSet() }
            .count { it.size == 3 }
    }
}