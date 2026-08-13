package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumNestingDepthOfTheParenthesesTest {

	private final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();

	@Test
	public void example1() {
		assertThat(solution.maxDepth("(1+(2*3)+((8)/4))+1")).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.maxDepth("(1)+((2))+(((3)))")).isEqualTo(3);
	}

	@Test
	public void example3() {
		assertThat(solution.maxDepth("()(())((()()))")).isEqualTo(3);
	}
}
