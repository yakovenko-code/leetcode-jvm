package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1446ConsecutiveCharactersTest {

	private final P1446ConsecutiveCharacters solution = new P1446ConsecutiveCharacters();

	@Test
	public void example1() {
		assertThat(solution.maxPower("leetcode")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.maxPower("abbcccddddeeeeedcba")).isEqualTo(5);
	}
}
