package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2278PercentageOfLetterInStringTest {

	private final P2278PercentageOfLetterInString solution = new P2278PercentageOfLetterInString();

	@Test
	public void example1() {
		assertThat(solution.percentageLetter("foobar", 'o')).isEqualTo(33);
	}

	@Test
	public void example2() {
		assertThat(solution.percentageLetter("jjjj", 'k')).isEqualTo(0);
	}
}
