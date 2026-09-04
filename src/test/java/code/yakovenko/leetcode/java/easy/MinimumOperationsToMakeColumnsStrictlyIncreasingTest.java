package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumOperationsToMakeColumnsStrictlyIncreasingTest {

	private final MinimumOperationsToMakeColumnsStrictlyIncreasing solution =
			new MinimumOperationsToMakeColumnsStrictlyIncreasing();

	@Test
	public void example1() {
		assertThat(solution.minimumOperations(new int[][]{{3, 1}, {1, 3}, {3, 4}, {0, 1}})).isEqualTo(15);
	}

	@Test
	public void example2() {
		assertThat(solution.minimumOperations(new int[][]{{3, 2, 1}, {2, 1, 0}, {1, 2, 3}})).isEqualTo(12);
	}
}
