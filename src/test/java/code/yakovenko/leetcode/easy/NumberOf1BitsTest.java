package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOf1BitsTest {

	private final NumberOf1Bits solution = new NumberOf1Bits();

	@Test
	public void example1() {
		assertThat(solution.hammingWeight(11)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.hammingWeight(128)).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.hammingWeight(2147483645)).isEqualTo(30);
	}
}
