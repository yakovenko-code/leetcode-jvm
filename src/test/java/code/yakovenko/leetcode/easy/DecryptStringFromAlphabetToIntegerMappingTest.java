package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DecryptStringFromAlphabetToIntegerMappingTest {

	private final DecryptStringFromAlphabetToIntegerMapping solution = new DecryptStringFromAlphabetToIntegerMapping();

	@Test
	public void example1() {
		assertThat(solution.freqAlphabets("10#11#12")).isEqualTo("jkab");
	}

	@Test
	public void example2() {
		assertThat(solution.freqAlphabets("1326#")).isEqualTo("acz");
	}
}
