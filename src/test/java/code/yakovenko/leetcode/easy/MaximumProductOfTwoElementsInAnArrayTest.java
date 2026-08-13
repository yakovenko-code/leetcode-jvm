package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumProductOfTwoElementsInAnArrayTest {

	private final MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();

	@Test
	public void test1() {
		assertThat(solution.maxProduct(new int[]{3, 4, 5, 2})).isEqualTo(12);
	}

	@Test
	public void test2() {
		assertThat(solution.maxProduct(new int[]{1, 5, 4, 5})).isEqualTo(16);
	}

	@Test
	public void test3() {
		assertThat(solution.maxProduct(new int[]{3, 7})).isEqualTo(12);
	}
}
