package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3487MaximumUniqueSubarraySumAfterDeletionTest {

	private final P3487MaximumUniqueSubarraySumAfterDeletion solution = new P3487MaximumUniqueSubarraySumAfterDeletion();

	@Test
	public void example1() {
		assertThat(solution.maxSum(new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
	}

	@Test
	public void example2() {
		assertThat(solution.maxSum(new int[]{1, 1, 0, 1, 1})).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.maxSum(new int[]{1, 2, -1, -2, 1, 0, -1})).isEqualTo(3);
	}
}
