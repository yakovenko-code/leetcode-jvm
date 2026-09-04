package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckDivisibilityByDigitSumAndProductTest {

	private final CheckDivisibilityByDigitSumAndProduct solution = new CheckDivisibilityByDigitSumAndProduct();

	@Test
	public void example1() {
		assertThat(solution.checkDivisibility(99)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkDivisibility(23)).isFalse();
	}
}
