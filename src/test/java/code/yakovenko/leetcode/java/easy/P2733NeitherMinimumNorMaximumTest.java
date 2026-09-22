package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2733NeitherMinimumNorMaximumTest {

	private final P2733NeitherMinimumNorMaximum solution = new P2733NeitherMinimumNorMaximum();

	@Test
	public void example1() {
		assertThat(solution.findNonMinOrMax(new int[]{3, 2, 1, 4})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.findNonMinOrMax(new int[]{1, 2})).isEqualTo(-1);
	}

	@Test
	public void example3() {
		assertThat(solution.findNonMinOrMax(new int[]{2, 1, 3})).isEqualTo(2);
	}
}
