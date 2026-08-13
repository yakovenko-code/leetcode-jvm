package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumNumberOfWordsYouCanTypeTest {

	private final MaximumNumberOfWordsYouCanType solution = new MaximumNumberOfWordsYouCanType();

	@Test
	public void test1() {
		assertThat(solution.canBeTypedWords("hello world", "ad")).isEqualTo(1);
	}

	@Test
	public void test2() {
		assertThat(solution.canBeTypedWords("leet code", "lt")).isEqualTo(1);
	}

	@Test
	public void test3() {
		assertThat(solution.canBeTypedWords("leet code", "e")).isEqualTo(0);
	}
}
