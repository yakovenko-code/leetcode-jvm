package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0374GuessNumberHigherOrLowerTest {

	private final P0374GuessNumberHigherOrLower solution = new P0374GuessNumberHigherOrLower();

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
