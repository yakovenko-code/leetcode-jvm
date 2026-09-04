package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfTwoStringArraysAreEquivalentTest {

	private final CheckIfTwoStringArraysAreEquivalent solution = new CheckIfTwoStringArraysAreEquivalent();

	@Test
	public void example1() {
		assertThat(solution.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"cb", "c"})).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"})).isTrue();
	}
}
