package code.yakovenko.leetcode.kotlin.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class P3512MinimumOperationsToMakeArraySumDivisibleByKTest {

    private val solution = P3512MinimumOperationsToMakeArraySumDivisibleByK()

    @Test
    fun example1() {
        assertThat(solution.minOperations(intArrayOf(3, 9, 7), 5)).isEqualTo(4)
    }

    @Test
    fun example2() {
        assertThat(solution.minOperations(intArrayOf(4, 1, 3), 4)).isEqualTo(0)
    }

    @Test
    fun example3() {
        assertThat(solution.minOperations(intArrayOf(3, 2), 6)).isEqualTo(5)
    }
}