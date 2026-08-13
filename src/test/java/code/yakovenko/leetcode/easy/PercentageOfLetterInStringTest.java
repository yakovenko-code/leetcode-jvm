package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PercentageOfLetterInStringTest {

	private final PercentageOfLetterInString solution = new PercentageOfLetterInString();

	@Test
	public void example1() {
		assertThat(solution.percentageLetter("foobar", 'o')).isEqualTo(33);
	}

	@Test
	public void example2() {
		assertThat(solution.percentageLetter("jjjj", 'k')).isEqualTo(0);
	}
}
