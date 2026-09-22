package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1935MaximumNumberOfWordsYouCanTypeTest {

	private final P1935MaximumNumberOfWordsYouCanType solution = new P1935MaximumNumberOfWordsYouCanType();

	@Test
	public void example1() {
		assertThat(solution.canBeTypedWords("hello world", "ad")).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.canBeTypedWords("leet code", "lt")).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.canBeTypedWords("leet code", "e")).isEqualTo(0);
	}
}
