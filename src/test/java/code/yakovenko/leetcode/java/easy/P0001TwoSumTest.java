package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0001TwoSumTest {

	private final P0001TwoSum solution = new P0001TwoSum();

	@Test
	public void example1() {
		assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
	}

	@Test
	public void example3() {
		assertThat(solution.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
	}
}
