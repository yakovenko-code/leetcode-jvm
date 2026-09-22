package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3541FindMostFrequentVowelAndConsonantTest {

	private final P3541FindMostFrequentVowelAndConsonant solution = new P3541FindMostFrequentVowelAndConsonant();

	@Test
	public void example1() {
		assertThat(solution.maxFreqSum("successes")).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.maxFreqSum("aeiaeia")).isEqualTo(3);
	}
}
