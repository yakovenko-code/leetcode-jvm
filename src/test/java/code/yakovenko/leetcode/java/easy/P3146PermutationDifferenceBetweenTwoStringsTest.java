package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3146PermutationDifferenceBetweenTwoStringsTest {

	private final P3146PermutationDifferenceBetweenTwoStrings solution = new P3146PermutationDifferenceBetweenTwoStrings();

	@Test
	public void example1() {
		assertThat(solution.findPermutationDifference("abc", "bac")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.findPermutationDifference("abcde", "edbac")).isEqualTo(12);
	}
}
