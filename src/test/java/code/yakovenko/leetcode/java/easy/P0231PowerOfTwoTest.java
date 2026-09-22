package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0231PowerOfTwoTest {

	private final P0231PowerOfTwo solution = new P0231PowerOfTwo();

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
