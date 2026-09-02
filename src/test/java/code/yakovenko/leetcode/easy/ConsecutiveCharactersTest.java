package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ConsecutiveCharactersTest {

	private final ConsecutiveCharacters solution = new ConsecutiveCharacters();

	@Test
	public void example1() {
		assertThat(solution.maxPower("leetcode")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.maxPower("abbcccddddeeeeedcba")).isEqualTo(5);
	}
}
