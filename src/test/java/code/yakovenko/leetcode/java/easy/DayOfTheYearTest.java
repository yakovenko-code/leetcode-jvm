package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DayOfTheYearTest {

	private final DayOfTheYear solution = new DayOfTheYear();

	@Test
	public void example1() {
		assertThat(solution.dayOfYear("2019-01-09")).isEqualTo(9);
	}

	@Test
	public void example2() {
		assertThat(solution.dayOfYear("2019-02-10")).isEqualTo(41);
	}
}
