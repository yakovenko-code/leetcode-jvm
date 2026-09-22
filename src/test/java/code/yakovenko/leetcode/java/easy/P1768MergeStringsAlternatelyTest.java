package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1768MergeStringsAlternatelyTest {

	private final P1768MergeStringsAlternately solution = new P1768MergeStringsAlternately();

	@Test
	public void example1() {
		assertThat(solution.mergeAlternately("abc", "pqr")).isEqualTo("apbqcr");
	}

	@Test
	public void example2() {
		assertThat(solution.mergeAlternately("ab", "pqrs")).isEqualTo("apbqrs");
	}

	@Test
	public void example3() {
		assertThat(solution.mergeAlternately("abcd", "pq")).isEqualTo("apbqcd");
	}
}
