package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ScoreOfAStringTest {

	private final ScoreOfAString solution = new ScoreOfAString();

	@Test
	public void example1() {
		assertThat(solution.scoreOfString("hello")).isEqualTo(13);
	}

	@Test
	public void example2() {
		assertThat(solution.scoreOfString("zaz")).isEqualTo(50);
	}
}
