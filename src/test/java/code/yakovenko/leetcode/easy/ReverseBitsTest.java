package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseBitsTest {

	private final ReverseBits solution = new ReverseBits();

	@Test
	public void test1() {
		assertThat(solution.reverseBits(43261596)).isEqualTo(964176192);
	}

	@Test
	public void test2() {
		assertThat(solution.reverseBits(2147483644)).isEqualTo(1073741822);
	}
}
