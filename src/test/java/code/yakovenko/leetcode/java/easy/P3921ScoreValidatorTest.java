package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3921ScoreValidatorTest {

	private final P3921ScoreValidator solution = new P3921ScoreValidator();

	@Test
	public void example1() {
		assertThat(solution.scoreValidator(new String[]{"1", "4", "W", "6", "WD"})).isEqualTo(new int[]{12, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.scoreValidator(new String[]{"WD", "NB", "0", "4", "4"})).isEqualTo(new int[]{10, 0});
	}

	@Test
	public void example3() {
		assertThat(solution.scoreValidator(new String[]{"W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"}))
				.isEqualTo(new int[]{0, 10});
	}
}
