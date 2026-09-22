package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3340CheckBalancedStringTest {

	private final P3340CheckBalancedString solution = new P3340CheckBalancedString();

	@Test
	public void example1() {
		assertThat(solution.isBalanced("1234")).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.isBalanced("24123")).isTrue();
	}
}
