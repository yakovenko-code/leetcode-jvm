package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TrimTrailingVowelsTest {

	private final TrimTrailingVowels solution = new TrimTrailingVowels();

	@Test
	public void example1() {
		assertThat(solution.trimTrailingVowels("idea")).isEqualTo("id");
	}

	@Test
	public void example2() {
		assertThat(solution.trimTrailingVowels("day")).isEqualTo("day");
	}

	@Test
	public void example3() {
		assertThat(solution.trimTrailingVowels("aeiou")).isEqualTo("");
	}
}
