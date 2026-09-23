package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0151ReverseWordsInAStringTest {

	private final P0151ReverseWordsInAString solution = new P0151ReverseWordsInAString();

	@Test
	public void example1() {
		assertThat(solution.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
	}

	@Test
	public void example2() {
		assertThat(solution.reverseWords("  hello world  ")).isEqualTo("world hello");
	}

	@Test
	public void example3() {
		assertThat(solution.reverseWords("a good   example")).isEqualTo("example good a");
	}
}
