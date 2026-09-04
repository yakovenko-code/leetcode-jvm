package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PowerOfTwoTest {

	private final PowerOfTwo solution = new PowerOfTwo();

	@Test
	public void example1() {
		assertThat(solution.isPowerOfTwo(1)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isPowerOfTwo(16)).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.isPowerOfTwo(3)).isFalse();
	}
}
