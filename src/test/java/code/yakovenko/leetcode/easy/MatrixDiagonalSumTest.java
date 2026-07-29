package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MatrixDiagonalSumTest {

	private final MatrixDiagonalSum solution = new MatrixDiagonalSum();

	@Test
	public void test1() {
		assertThat(solution.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).isEqualTo(25);
	}

	@Test
	public void test2() {
		assertThat(solution.diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}))
				.isEqualTo(8);
	}

	@Test
	public void test3() {
		assertThat(solution.diagonalSum(new int[][]{{5}})).isEqualTo(5);
	}
}
