package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0014LongestCommonPrefixTest {

	private final P0014LongestCommonPrefix solution = new P0014LongestCommonPrefix();

	@Test
	public void example1() {
		assertThat(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
	}

	@Test
	public void example2() {
		assertThat(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
	}
}
