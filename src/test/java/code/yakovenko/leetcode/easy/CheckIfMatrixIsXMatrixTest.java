package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfMatrixIsXMatrixTest {

	private final CheckIfMatrixIsXMatrix solution = new CheckIfMatrixIsXMatrix();

	@Test
	public void example1() {
		assertThat(solution.checkXMatrix(new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkXMatrix(new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}})).isFalse();
	}
}
