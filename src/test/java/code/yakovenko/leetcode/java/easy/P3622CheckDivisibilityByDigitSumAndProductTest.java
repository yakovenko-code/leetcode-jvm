package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3622CheckDivisibilityByDigitSumAndProductTest {

	private final P3622CheckDivisibilityByDigitSumAndProduct solution = new P3622CheckDivisibilityByDigitSumAndProduct();

	@Test
	public void example1() {
		assertThat(solution.checkDivisibility(99)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkDivisibility(23)).isFalse();
	}
}
