package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3945DigitFrequencyScoreTest {

	private final P3945DigitFrequencyScore solution = new P3945DigitFrequencyScore();

	@Test
	public void example1() {
		assertThat(solution.digitFrequencyScore(122)).isEqualTo(5);
	}

	@Test
	public void example2() {
		assertThat(solution.digitFrequencyScore(101)).isEqualTo(2);
	}
}
