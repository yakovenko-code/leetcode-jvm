package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RunningSumOf1DArrayTest {

	private final RunningSumOf1DArray solution = new RunningSumOf1DArray();

	@Test
	public void example1() {
		assertThat(solution.runningSum(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
	}

	@Test
	public void example2() {
		assertThat(solution.runningSum(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
	}

	@Test
	public void example3() {
		assertThat(solution.runningSum(new int[]{3, 1, 2, 10, 1})).isEqualTo(new int[]{3, 4, 6, 16, 17});
	}
}
