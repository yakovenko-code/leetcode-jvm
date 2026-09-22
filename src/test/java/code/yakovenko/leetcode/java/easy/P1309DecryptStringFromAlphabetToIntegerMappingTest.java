package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1309DecryptStringFromAlphabetToIntegerMappingTest {

	private final P1309DecryptStringFromAlphabetToIntegerMapping solution = new P1309DecryptStringFromAlphabetToIntegerMapping();

	@Test
	public void example1() {
		assertThat(solution.freqAlphabets("10#11#12")).isEqualTo("jkab");
	}

	@Test
	public void example2() {
		assertThat(solution.freqAlphabets("1326#")).isEqualTo("acz");
	}
}
