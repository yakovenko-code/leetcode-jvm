package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TransposeMatrixTest {

	private final TransposeMatrix solution = new TransposeMatrix();

	@Test
	public void example1() {
		assertThat(solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}))
				.isEqualTo(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
	}

	@Test
	public void example2() {
		assertThat(solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}))
				.isEqualTo(new int[][]{{1, 4}, {2, 5}, {3, 6}});
	}
}
