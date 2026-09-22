package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2224MinimumNumberOfOperationsToConvertTimeTest {

	private final P2224MinimumNumberOfOperationsToConvertTime solution = new P2224MinimumNumberOfOperationsToConvertTime();

	@Test
	public void example1() {
		assertThat(solution.convertTime("02:30", "04:35")).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.convertTime("11:00", "11:01")).isEqualTo(1);
	}
}
