package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumBitFlipsToConvertNumberTest {

	private final MinimumBitFlipsToConvertNumber solution = new MinimumBitFlipsToConvertNumber();

	@Test
	public void test1() {
		assertThat(solution.minBitFlips(10, 7)).isEqualTo(3);
	}

	@Test
	public void test2() {
		assertThat(solution.minBitFlips(3, 4)).isEqualTo(3);
	}
}
