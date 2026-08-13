package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountPrefixesOfAGivenStringTest {

	private final CountPrefixesOfAGivenString solution = new CountPrefixesOfAGivenString();

	@Test
	public void example1() {
		assertThat(solution.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"))
				.isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.countPrefixes(new String[]{"a", "a"}, "aa")).isEqualTo(2);
	}
}
