package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2248IntersectionOfMultipleArraysTest {

	private final P2248IntersectionOfMultipleArrays solution = new P2248IntersectionOfMultipleArrays();

	@Test
	public void example1() {
		assertThat(solution.intersection(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}))
				.isEqualTo(List.of(3, 4));
	}

	@Test
	public void example2() {
		assertThat(solution.intersection(new int[][]{{1, 2, 3}, {4, 5, 6}}))
				.isEqualTo(List.of());
	}
}
