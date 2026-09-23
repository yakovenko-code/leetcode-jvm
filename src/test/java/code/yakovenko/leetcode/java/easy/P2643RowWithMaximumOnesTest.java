package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2643RowWithMaximumOnesTest {

	private final P2643RowWithMaximumOnes solution = new P2643RowWithMaximumOnes();

	@Test
	public void example1() {
		assertThat(solution.rowAndMaximumOnes(new int[][]{{0, 1}, {1, 0}})).isEqualTo(new int[]{0, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.rowAndMaximumOnes(new int[][]{{0, 0, 0}, {0, 1, 1}})).isEqualTo(new int[]{1, 2});
	}

	@Test
	public void example3() {
		assertThat(solution.rowAndMaximumOnes(new int[][]{{0, 0}, {1, 1}, {0, 0}})).isEqualTo(new int[]{1, 2});
	}
}
