package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MergeStringsAlternatelyTest {

	private final MergeStringsAlternately solution = new MergeStringsAlternately();

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
