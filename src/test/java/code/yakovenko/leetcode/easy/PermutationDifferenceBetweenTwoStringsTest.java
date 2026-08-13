package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PermutationDifferenceBetweenTwoStringsTest {

	private final PermutationDifferenceBetweenTwoStrings solution = new PermutationDifferenceBetweenTwoStrings();

	@Test
	public void example1() {
		assertThat(solution.findPermutationDifference("abc", "bac")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.findPermutationDifference("abcde", "edbac")).isEqualTo(12);
	}
}
