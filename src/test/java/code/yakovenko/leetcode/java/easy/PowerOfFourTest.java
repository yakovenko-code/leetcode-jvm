package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PowerOfFourTest {

	private final PowerOfFour solution = new PowerOfFour();

	@Test
	public void example1() {
		assertThat(solution.isPowerOfFour(16)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isPowerOfFour(5)).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.isPowerOfFour(1)).isTrue();
	}
}