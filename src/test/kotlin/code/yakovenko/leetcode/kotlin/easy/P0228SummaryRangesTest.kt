package code.yakovenko.leetcode.kotlin.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class P0228SummaryRangesTest {

    private val solution = P0228SummaryRanges()

    @Test
    fun example1() {
        assertThat<String?>(solution.summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
            .isEqualTo(mutableListOf<String?>("0->2", "4->5", "7"))
    }

    @Test
    fun example2() {
        assertThat<String?>(solution.summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)))
            .isEqualTo(mutableListOf<String?>("0", "2->4", "6", "8->9"))
    }
}