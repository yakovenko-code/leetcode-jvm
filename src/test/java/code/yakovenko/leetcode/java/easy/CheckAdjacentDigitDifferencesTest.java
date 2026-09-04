package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckAdjacentDigitDifferencesTest {

	private final CheckAdjacentDigitDifferences solution = new CheckAdjacentDigitDifferences();

	@Test
	public void example1() {
		assertThat(solution.isAdjacentDiffAtMostTwo("132")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isAdjacentDiffAtMostTwo("129")).isFalse();
	}
}
