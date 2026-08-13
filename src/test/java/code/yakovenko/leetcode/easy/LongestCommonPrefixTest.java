package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class LongestCommonPrefixTest {

	private final LongestCommonPrefix solution = new LongestCommonPrefix();

	@Test
	public void example1() {
		assertThat(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
	}

	@Test
	public void example2() {
		assertThat(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
	}
}
