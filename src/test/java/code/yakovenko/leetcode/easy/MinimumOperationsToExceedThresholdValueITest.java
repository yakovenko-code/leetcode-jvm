package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumOperationsToExceedThresholdValueITest {

	private final MinimumOperationsToExceedThresholdValueI solution = new MinimumOperationsToExceedThresholdValueI();

	@Test
	public void test1() {
		assertThat(solution.minOperations(new int[]{2, 11, 10, 1, 3}, 10)).isEqualTo(3);
	}

	@Test
	public void test2() {
		assertThat(solution.minOperations(new int[]{1, 1, 2, 4, 9}, 1)).isEqualTo(0);
	}

	@Test
	public void test3() {
		assertThat(solution.minOperations(new int[]{1, 1, 2, 4, 9}, 9)).isEqualTo(4);
	}
}
