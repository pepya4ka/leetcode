package com.pepyachka.medium.sum_of_mutated_array_closest_to_target

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SolutionTest {

    @ParameterizedTest
    @MethodSource("arrayTargetExpectedData")
    fun findBestValue(arr: IntArray, target: Int, expected: Int) {
        val actual = Solution().findBestValue(arr, target)
        Assertions.assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun arrayTargetExpectedData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(4, 9, 3), 10, 3),
                Arguments.of(intArrayOf(2, 3, 5), 10, 5),
                Arguments.of(intArrayOf(2, 3, 5), 11, 5),
                Arguments.of(intArrayOf(1, 2, 23, 24, 34, 36), 110, 30),
                Arguments.of(intArrayOf(60864, 25176, 27249, 21296, 20204), 56803, 11361),
                Arguments.of(intArrayOf(15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 50, 15),
                Arguments.of(intArrayOf(2, 2), 3, 1),
                Arguments.of(intArrayOf(1, 1, 2), 10, 2)
            )
        }
    }
}