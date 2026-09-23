package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3870CountCommasInRangeTest {

	private final P3870CountCommasInRange solution = new P3870CountCommasInRange();

	@Test
	public void example1() {
		assertThat(solution.countCommas(1002)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.countCommas(998)).isEqualTo(0);
	}
}
