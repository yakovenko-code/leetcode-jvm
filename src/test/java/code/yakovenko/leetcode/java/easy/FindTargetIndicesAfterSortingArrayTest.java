package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTargetIndicesAfterSortingArrayTest {

	private final FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();

	@Test
	public void example1() {
		assertThat(solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 2)).isEqualTo(List.of(1, 2));
	}

	@Test
	public void example2() {
		assertThat(solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 3)).isEqualTo(List.of(3));
	}

	@Test
	public void example3() {
		assertThat(solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 5)).isEqualTo(List.of(4));
	}
}
