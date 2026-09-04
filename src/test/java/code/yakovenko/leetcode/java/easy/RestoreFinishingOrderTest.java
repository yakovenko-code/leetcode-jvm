package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RestoreFinishingOrderTest {

	private final RestoreFinishingOrder solution = new RestoreFinishingOrder();

	@Test
	public void example1() {
		assertThat(solution.recoverOrder(new int[]{3, 1, 2, 5, 4}, new int[]{1, 3, 4}))
				.isEqualTo(new int[]{3, 1, 4});
	}

	@Test
	public void example2() {
		assertThat(solution.recoverOrder(new int[]{1, 4, 5, 3, 2}, new int[]{2, 5}))
				.isEqualTo(new int[]{5, 2});
	}
}
