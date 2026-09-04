package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SplitTheArrayTest {

	private final SplitTheArray solution = new SplitTheArray();

	@Test
	public void example1() {
		assertThat(solution.isPossibleToSplit(new int[]{1, 1, 2, 2, 3, 4})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isPossibleToSplit(new int[]{1, 1, 1, 1})).isFalse();
	}
}
