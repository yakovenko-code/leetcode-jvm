package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckBalancedStringTest {

	private final CheckBalancedString solution = new CheckBalancedString();

	@Test
	public void example1() {
		assertThat(solution.isBalanced("1234")).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.isBalanced("24123")).isTrue();
	}
}
