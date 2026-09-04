package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheDegreeOfEachVertexTest {

	private final FindTheDegreeOfEachVertex solution = new FindTheDegreeOfEachVertex();

	@Test
	public void example1() {
		assertThat(solution.findDegrees(new int[][]{{0, 1, 1}, {1, 0, 1}, {1, 1, 0}})).isEqualTo(new int[]{2, 2, 2});
	}

	@Test
	public void example2() {
		assertThat(solution.findDegrees(new int[][]{{0, 1, 0}, {1, 0, 0}, {0, 0, 0}})).isEqualTo(new int[]{1, 1, 0});
	}

	@Test
	public void example3() {
		assertThat(solution.findDegrees(new int[][]{{0}})).isEqualTo(new int[]{0});
	}
}
