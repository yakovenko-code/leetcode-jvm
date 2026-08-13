package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ThreeDivisorsTest {

	private final ThreeDivisors solution = new ThreeDivisors();

	@Test
	public void example1() {
		assertThat(solution.isThree(2)).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.isThree(4)).isTrue();
	}
}
