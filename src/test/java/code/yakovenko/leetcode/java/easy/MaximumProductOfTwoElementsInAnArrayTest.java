package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumProductOfTwoElementsInAnArrayTest {

	private final MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();

	@Test
	public void example1() {
		assertThat(solution.maxProduct(new int[]{3, 4, 5, 2})).isEqualTo(12);
	}

	@Test
	public void example2() {
		assertThat(solution.maxProduct(new int[]{1, 5, 4, 5})).isEqualTo(16);
	}

	@Test
	public void example3() {
		assertThat(solution.maxProduct(new int[]{3, 7})).isEqualTo(12);
	}
}
