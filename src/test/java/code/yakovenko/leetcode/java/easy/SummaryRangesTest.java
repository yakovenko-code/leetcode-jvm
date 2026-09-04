package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class SummaryRangesTest {

	private final SummaryRanges solution = new SummaryRanges();

	@Test
	public void example1() {
		assertThat(solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7})).isEqualTo(List.of("0->2", "4->5", "7"));
	}

	@Test
	public void example2() {
		assertThat(solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})).isEqualTo(List.of("0", "2->4", "6", "8->9"));
	}
}
