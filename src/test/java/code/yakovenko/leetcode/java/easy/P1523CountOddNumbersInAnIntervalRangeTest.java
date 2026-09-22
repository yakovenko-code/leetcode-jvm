package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1523CountOddNumbersInAnIntervalRangeTest {

	private final P1523CountOddNumbersInAnIntervalRange solution = new P1523CountOddNumbersInAnIntervalRange();

	@Test
	public void example1() {
		assertThat(solution.countOdds(3, 7)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.countOdds(8, 10)).isEqualTo(1);
	}
}
