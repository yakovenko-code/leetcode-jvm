package code.yakovenko.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumSubstringsWithDistinctStartTest {

	private final MaximumSubstringsWithDistinctStart solution = new MaximumSubstringsWithDistinctStart();

	@Test
	public void example1() {
		assertThat(solution.maxDistinct("abab")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.maxDistinct("abcd")).isEqualTo(4);
	}

	@Test
	public void example3() {
		assertThat(solution.maxDistinct("aaaa")).isEqualTo(1);
	}
}
