package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountOddNumbersInAnIntervalRangeTest {

	private final CountOddNumbersInAnIntervalRange solution = new CountOddNumbersInAnIntervalRange();

	@Test
	public void example1() {
		assertThat(solution.countOdds(3, 7)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.countOdds(8, 10)).isEqualTo(1);
	}
}
