package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1952ThreeDivisorsTest {

	private final P1952ThreeDivisors solution = new P1952ThreeDivisors();

	@Test
	public void example1() {
		assertThat(solution.isThree(2)).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.isThree(4)).isTrue();
	}
}
