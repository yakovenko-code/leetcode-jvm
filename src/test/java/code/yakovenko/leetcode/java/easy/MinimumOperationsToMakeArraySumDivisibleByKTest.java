package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumOperationsToMakeArraySumDivisibleByKTest {

	private final MinimumOperationsToMakeArraySumDivisibleByK solution =
			new MinimumOperationsToMakeArraySumDivisibleByK();

	@Test
	public void example1() {
		assertThat(solution.minOperations(new int[]{3, 9, 7}, 5)).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.minOperations(new int[]{4, 1, 3}, 4)).isEqualTo(0);
	}

	@Test
	public void example3() {
		assertThat(solution.minOperations(new int[]{3, 2}, 6)).isEqualTo(5);
	}
}
