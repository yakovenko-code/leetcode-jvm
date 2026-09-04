package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheDifferenceOfTwoArraysTest {

	private final FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();

	@Test
	public void example1() {
		assertThat(solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}))
				.isEqualTo(List.of(List.of(1, 3), List.of(4, 6)));
	}

	@Test
	public void example2() {
		assertThat(solution.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}))
				.isEqualTo(List.of(List.of(3), List.of()));
	}
}
