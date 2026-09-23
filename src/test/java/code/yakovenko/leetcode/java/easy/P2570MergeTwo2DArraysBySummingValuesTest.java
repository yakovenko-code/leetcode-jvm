package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2570MergeTwo2DArraysBySummingValuesTest {

	private final P2570MergeTwo2DArraysBySummingValues solution = new P2570MergeTwo2DArraysBySummingValues();

	@Test
	public void example1() {
		assertThat(solution.mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}}))
				.isEqualTo(new int[][]{{1, 6}, {2, 3}, {3, 2}, {4, 6}});
	}

	@Test
	public void example2() {
		assertThat(solution.mergeArrays(new int[][]{{2, 4}, {3, 6}, {5, 5}}, new int[][]{{1, 3}, {4, 3}}))
				.isEqualTo(new int[][]{{1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}});
	}
}
