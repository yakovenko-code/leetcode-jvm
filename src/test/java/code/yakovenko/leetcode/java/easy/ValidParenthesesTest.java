package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ValidParenthesesTest {

	private final ValidParentheses solution = new ValidParentheses();

	@Test
	public void example1() {
		assertThat(solution.isValid("()")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isValid("()[]{}")).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.isValid("(]")).isFalse();
	}

	@Test
	public void example4() {
		assertThat(solution.isValid("([])")).isTrue();
	}

	@Test
	public void example5() {
		assertThat(solution.isValid("([)]")).isFalse();
	}
}
