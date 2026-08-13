package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindMostFrequentVowelAndConsonantTest {

	private final FindMostFrequentVowelAndConsonant solution = new FindMostFrequentVowelAndConsonant();

	@Test
	public void example1() {
		assertThat(solution.maxFreqSum("successes")).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.maxFreqSum("aeiaeia")).isEqualTo(3);
	}
}
