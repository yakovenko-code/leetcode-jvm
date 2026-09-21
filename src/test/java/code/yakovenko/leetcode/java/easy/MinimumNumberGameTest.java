package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumNumberGameTest {

	private final MinimumNumberGame solution = new MinimumNumberGame();

	@Test
	public void example1() {
		assertThat(solution.numberGame(new int[]{5, 4, 2, 3})).isEqualTo(new int[]{3, 2, 5, 4});
	}

	@Test
	public void example2() {
		assertThat(solution.numberGame(new int[]{2, 5})).isEqualTo(new int[]{5, 2});
	}
}
