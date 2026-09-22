package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3931CheckAdjacentDigitDifferencesTest {

	private final P3931CheckAdjacentDigitDifferences solution = new P3931CheckAdjacentDigitDifferences();

	@Test
	public void example1() {
		assertThat(solution.isAdjacentDiffAtMostTwo("132")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isAdjacentDiffAtMostTwo("129")).isFalse();
	}
}
