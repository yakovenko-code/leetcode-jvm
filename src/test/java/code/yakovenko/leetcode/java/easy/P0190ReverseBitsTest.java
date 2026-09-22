package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0190ReverseBitsTest {

	private final P0190ReverseBits solution = new P0190ReverseBits();

	@Test
	public void example1() {
		assertThat(solution.reverseBits(43261596)).isEqualTo(964176192);
	}

	@Test
	public void example2() {
		assertThat(solution.reverseBits(2147483644)).isEqualTo(1073741822);
	}
}
