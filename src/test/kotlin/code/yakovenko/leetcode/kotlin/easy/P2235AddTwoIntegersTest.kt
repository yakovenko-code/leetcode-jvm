package code.yakovenko.leetcode.kotlin.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class P2235AddTwoIntegersTest {

    private val solution = P2235AddTwoIntegers()

    @Test
    fun example1() {
        assertThat(solution.sum(12, 5)).isEqualTo(17)
    }

    @Test
    fun example2() {
        assertThat(solution.sum(-10, 4)).isEqualTo(-6)
    }
}
