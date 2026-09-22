package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2220MinimumBitFlipsToConvertNumberTest {

	private final P2220MinimumBitFlipsToConvertNumber solution = new P2220MinimumBitFlipsToConvertNumber();

	@Test
	public void example1() {
		assertThat(solution.minBitFlips(10, 7)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.minBitFlips(3, 4)).isEqualTo(3);
	}
}
