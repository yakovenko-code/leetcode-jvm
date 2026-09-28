package code.yakovenko.leetcode.kotlin.easy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class P0268MissingNumberTest {

    private val solution = P0268MissingNumber()

    @Test
    fun example1() {
        Assertions.assertThat(solution.missingNumber(intArrayOf(3, 0, 1))).isEqualTo(2)
    }

    @Test
    fun example2() {
        Assertions.assertThat(solution.missingNumber(intArrayOf(0, 1))).isEqualTo(2)
    }

    @Test
    fun example3() {
        Assertions.assertThat(solution.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))).isEqualTo(8)
    }
}