package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0022GenerateParenthesesTest {

	private final P0022GenerateParentheses solution = new P0022GenerateParentheses();

	@Test
	public void example1() {
		assertThat(solution.generateParenthesis(3))
				.isEqualTo(List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
	}

	@Test
	public void example2() {
		assertThat(solution.generateParenthesis(1)).isEqualTo(List.of("()"));
	}
}
