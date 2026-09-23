package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3986NumberOfElapsedSecondsBetweenTwoTimesTest {

	private final P3986NumberOfElapsedSecondsBetweenTwoTimes solution = new P3986NumberOfElapsedSecondsBetweenTwoTimes();

	@Test
	public void example1() {
		assertThat(solution.secondsBetweenTimes("01:00:00", "01:00:25")).isEqualTo(25);
	}

	@Test
	public void example2() {
		assertThat(solution.secondsBetweenTimes("12:34:56", "13:00:00")).isEqualTo(1504);
	}
}
