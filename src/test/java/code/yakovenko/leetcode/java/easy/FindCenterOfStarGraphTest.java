package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindCenterOfStarGraphTest {

	private final FindCenterOfStarGraph solution = new FindCenterOfStarGraph();

	@Test
	public void example1() {
		assertThat(solution.findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}})).isEqualTo(1);
	}
}
