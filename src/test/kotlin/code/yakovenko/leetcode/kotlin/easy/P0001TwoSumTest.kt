package code.yakovenko.leetcode.kotlin.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class P0001TwoSumTest {

    val solution = P0001TwoSum()

    @Test
    fun example1() {
        assertThat(solution.twoSum(intArrayOf(2, 7, 11, 15), 9)).isEqualTo(intArrayOf(0, 1))
    }

    @Test
    fun example2() {
        assertThat(solution.twoSum(intArrayOf(3, 2, 4), 6)).isEqualTo(intArrayOf(1, 2))
    }

    @Test
    fun example3() {
        assertThat(solution.twoSum(intArrayOf(3, 3), 6)).isEqualTo(intArrayOf(0, 1))
    }
}