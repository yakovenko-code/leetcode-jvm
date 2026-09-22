package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2235AddTwoIntegersTest {

	private final P2235AddTwoIntegers solution = new P2235AddTwoIntegers();

	@Test
	public void example1() {
		assertThat(solution.sum(12, 5)).isEqualTo(17);
	}

	@Test
	public void example2() {
		assertThat(solution.sum(-10, 4)).isEqualTo(-6);
	}
}
