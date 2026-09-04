package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumDifferenceBetweenAdjacentElementsInACircularArrayTest {

	private final MaximumDifferenceBetweenAdjacentElementsInACircularArray solution =
			new MaximumDifferenceBetweenAdjacentElementsInACircularArray();

	@Test
	public void example1() {
		assertThat(solution.maxAdjacentDistance(new int[]{1, 2, 4})).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.maxAdjacentDistance(new int[]{-5, -10, -5})).isEqualTo(5);
	}
}
