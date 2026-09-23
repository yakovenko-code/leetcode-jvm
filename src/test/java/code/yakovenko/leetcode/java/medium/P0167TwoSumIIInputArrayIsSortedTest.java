package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0167TwoSumIIInputArrayIsSortedTest {

	private final P0167TwoSumIIInputArrayIsSorted solution = new P0167TwoSumIIInputArrayIsSorted();

	@Test
	public void example1() {
		assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{1, 2});
	}

	@Test
	public void example2() {
		assertThat(solution.twoSum(new int[]{2, 3, 4}, 6)).isEqualTo(new int[]{1, 3});
	}

	@Test
	public void example3() {
		assertThat(solution.twoSum(new int[]{-1, 0}, -1)).isEqualTo(new int[]{1, 2});
	}
}
