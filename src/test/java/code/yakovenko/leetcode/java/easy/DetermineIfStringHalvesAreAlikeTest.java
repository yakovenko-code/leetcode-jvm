package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DetermineIfStringHalvesAreAlikeTest {

	private final DetermineIfStringHalvesAreAlike solution = new DetermineIfStringHalvesAreAlike();

	@Test
	public void example1() {
		assertThat(solution.halvesAreAlike("book")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.halvesAreAlike("textbook")).isFalse();
	}
}
