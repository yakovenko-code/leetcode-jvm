package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class LargestLocalValuesInAMatrixTest {

	private final LargestLocalValuesInAMatrix solution = new LargestLocalValuesInAMatrix();

	@Test
	public void example1() {
		assertThat(solution.largestLocal(
				new int[][]{
						{9, 9, 8, 1},
						{5, 6, 2, 6},
						{8, 2, 6, 4},
						{6, 2, 2, 2}
				})
		).isEqualTo(new int[][]{{9, 9}, {8, 6}});
	}

	@Test
	public void example2() {
		assertThat(solution.largestLocal(
				new int[][]{
						{1, 1, 1, 1, 1},
						{1, 1, 1, 1, 1},
						{1, 1, 2, 1, 1},
						{1, 1, 1, 1, 1},
						{1, 1, 1, 1, 1}
				})
		).isEqualTo(new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}});
	}
}
