package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public final class LeftAndRightSumDifferencesTest {

	private final LeftAndRightSumDifferences solution = new LeftAndRightSumDifferences();

	@Test
	public void example1() {
		assertThat(solution.leftRightDifference(new int[]{10, 4, 8, 3})).isEqualTo(new int[]{15, 1, 11, 22});
	}

	@Test
	public void example2() {
		assertThat(solution.leftRightDifference(new int[]{1})).isEqualTo(new int[]{0});
	}
}
