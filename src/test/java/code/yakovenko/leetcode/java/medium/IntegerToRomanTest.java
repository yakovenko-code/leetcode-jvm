package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class IntegerToRomanTest {

	private final IntegerToRoman solution = new IntegerToRoman();

	@Test
	public void example1() {
		assertThat(solution.intToRoman(3749)).isEqualTo("MMMDCCXLIX");
	}

	@Test
	public void example2() {
		assertThat(solution.intToRoman(58)).isEqualTo("LVIII");
	}

	@Test
	public void example3() {
		assertThat(solution.intToRoman(1994)).isEqualTo("MCMXCIV");
	}
}
