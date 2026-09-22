package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2600KItemsWithTheMaximumSumTest {

	private final P2600KItemsWithTheMaximumSum solution = new P2600KItemsWithTheMaximumSum();

	@Test
	public void example1() {
		assertThat(solution.kItemsWithMaximumSum(3, 2, 0, 2)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.kItemsWithMaximumSum(3, 2, 0, 4)).isEqualTo(3);
	}
}
