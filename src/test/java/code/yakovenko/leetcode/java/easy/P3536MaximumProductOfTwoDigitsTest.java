package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3536MaximumProductOfTwoDigitsTest {

	private final P3536MaximumProductOfTwoDigits solution = new P3536MaximumProductOfTwoDigits();

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
