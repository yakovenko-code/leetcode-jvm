package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountTheNumberOfConsistentStringsTest {

	private final CountTheNumberOfConsistentStrings solution = new CountTheNumberOfConsistentStrings();

	@Test
	public void example1() {
		assertThat(solution.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}))
				.isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}))
				.isEqualTo(7);
	}

	@Test
	public void example3() {
		assertThat(solution.countConsistentStrings(
				"cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"})
		).isEqualTo(4);
	}
}
