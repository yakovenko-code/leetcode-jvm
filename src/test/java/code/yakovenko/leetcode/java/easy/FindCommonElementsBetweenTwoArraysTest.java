package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindCommonElementsBetweenTwoArraysTest {

	private final FindCommonElementsBetweenTwoArrays solution = new FindCommonElementsBetweenTwoArrays();

	@Test
	public void example1() {
		assertThat(solution.findIntersectionValues(new int[]{2, 3, 2}, new int[]{1, 2})).isEqualTo(new int[]{2, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.findIntersectionValues(new int[]{4, 3, 2, 3, 1}, new int[]{2, 2, 5, 2, 3, 6}))
				.isEqualTo(new int[]{3, 4});
	}

	@Test
	public void example3() {
		assertThat(solution.findIntersectionValues(new int[]{3, 4, 2, 3}, new int[]{1, 5})).isEqualTo(new int[]{0, 0});
	}
}
