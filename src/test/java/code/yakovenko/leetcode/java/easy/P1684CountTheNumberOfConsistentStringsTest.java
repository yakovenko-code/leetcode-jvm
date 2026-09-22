package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1684CountTheNumberOfConsistentStringsTest {

	private final P1684CountTheNumberOfConsistentStrings solution = new P1684CountTheNumberOfConsistentStrings();

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
