package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0039CombinationSumTest {

	private final P0039CombinationSum solution = new P0039CombinationSum();

	@Test
	public void example1() {
		assertThat(solution.combinationSum(new int[]{2, 3, 6, 7}, 7))
				.isEqualTo(List.of(List.of(2, 2, 3), List.of(7)));
	}

	@Test
	public void example2() {
		assertThat(solution.combinationSum(new int[]{2, 3, 5}, 8))
				.isEqualTo(List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)));
	}

	@Test
	public void example3() {
		assertThat(solution.combinationSum(new int[]{2}, 1)).isEqualTo(List.of());
	}
}
