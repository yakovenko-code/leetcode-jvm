package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0349IntersectionOfTwoArraysTest {

	private final P0349IntersectionOfTwoArrays solution = new P0349IntersectionOfTwoArrays();

	@Test
	public void example1() {
		assertThat(solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})).isEqualTo(new int[]{2});
	}

	@Test
	public void example2() {
		assertThat(solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).isEqualTo(new int[]{9, 4});
	}
}
