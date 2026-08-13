package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReplaceAllDigitsWithCharactersTest {

	private final ReplaceAllDigitsWithCharacters solution = new ReplaceAllDigitsWithCharacters();

	@Test
	public void test1() {
		assertThat(solution.replaceDigits("a1c1e1")).isEqualTo("abcdef");
	}

	@Test
	public void test2() {
		assertThat(solution.replaceDigits("a1b2c3d4e")).isEqualTo("abbdcfdhe");
	}
}
