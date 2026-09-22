package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3982SumOfIntegersWithMaximumDigitRangeTest {

	private final P3982SumOfIntegersWithMaximumDigitRange solution = new P3982SumOfIntegersWithMaximumDigitRange();

	@Test
	public void example1() {
		assertThat(solution.maxDigitRange(new int[]{5724, 111, 350})).isEqualTo(6074);
	}

	@Test
	public void example2() {
		assertThat(solution.maxDigitRange(new int[]{90, 900})).isEqualTo(990);
	}
}
