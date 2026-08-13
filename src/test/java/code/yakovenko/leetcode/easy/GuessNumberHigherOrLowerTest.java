package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class GuessNumberHigherOrLowerTest {

	private final GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();

	@Test
	public void example1() {
		solution.setPick(6);
		assertThat(solution.guessNumber(10)).isEqualTo(6);
	}

	@Test
	public void example2() {
		solution.setPick(1);
		assertThat(solution.guessNumber(1)).isEqualTo(1);
	}

	@Test
	public void example3() {
		solution.setPick(1);
		assertThat(solution.guessNumber(2)).isEqualTo(1);
	}
}
