package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RichestCustomerWealthTest {

	private final RichestCustomerWealth solution = new RichestCustomerWealth();

	@Test
	public void example1() {
		assertThat(solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}})).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}})).isEqualTo(10);
	}
}
