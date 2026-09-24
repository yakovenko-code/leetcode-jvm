package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.Constants;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0050PowXNTest {

	private final P0050PowXN solution = new P0050PowXN();

	@Test
	public void example1() {
		assertThat(solution.myPow(2.00000, 10)).isCloseTo(1024.00000, Constants.TOLERANCE);
	}

	@Test
	public void example2() {
		assertThat(solution.myPow(2.10000, 3)).isCloseTo(9.26100, Constants.TOLERANCE);
	}

	@Test
	public void example3() {
		assertThat(solution.myPow(2.00000, -2)).isCloseTo(0.25000, Constants.TOLERANCE);
	}
}
