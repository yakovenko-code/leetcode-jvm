package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class MergeSimilarItemsTest {

	private final MergeSimilarItems solution = new MergeSimilarItems();

	@Test
	public void example1() {
		assertThat(solution.mergeSimilarItems(new int[][]{{1, 1}, {4, 5}, {3, 8}}, new int[][]{{3, 1}, {1, 5}}))
				.isEqualTo(List.of(List.of(1, 6), List.of(3, 9), List.of(4, 5)));
	}

	@Test
	public void example2() {
		assertThat(solution.mergeSimilarItems(new int[][]{{1, 1}, {3, 2}, {2, 3}}, new int[][]{{2, 1}, {3, 2}, {1, 3}}))
				.isEqualTo(List.of(List.of(1, 4), List.of(2, 4), List.of(3, 4)));
	}

	@Test
	public void example3() {
		assertThat(solution.mergeSimilarItems(new int[][]{{1, 3}, {2, 2}}, new int[][]{{7, 1}, {2, 2}, {1, 4}}))
				.isEqualTo(List.of(List.of(1, 7), List.of(2, 4), List.of(7, 1)));
	}
}
