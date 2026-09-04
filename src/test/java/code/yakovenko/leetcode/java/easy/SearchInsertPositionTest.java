package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SearchInsertPositionTest {

	private final SearchInsertPosition solution = new SearchInsertPosition();

	@Test
	public void example1() {
		assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
	}
}
