package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumProductOfTwoDigitsTest {

	private final MaximumProductOfTwoDigits solution = new MaximumProductOfTwoDigits();

	@Test
	public void example1() {
		assertThat(solution.maxProduct(31)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.maxProduct(22)).isEqualTo(4);
	}

	@Test
	public void example3() {
		assertThat(solution.maxProduct(124)).isEqualTo(8);
	}
}
