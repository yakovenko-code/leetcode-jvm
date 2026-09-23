package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2744FindMaximumNumberOfStringPairsTest {

	private final P2744FindMaximumNumberOfStringPairs solution = new P2744FindMaximumNumberOfStringPairs();

	@Test
	public void example1() {
		assertThat(solution.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}))
				.isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.maximumNumberOfStringPairs(new String[]{"ab", "ba", "cc"})).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.maximumNumberOfStringPairs(new String[]{"aa", "ab"})).isEqualTo(0);
	}
}
