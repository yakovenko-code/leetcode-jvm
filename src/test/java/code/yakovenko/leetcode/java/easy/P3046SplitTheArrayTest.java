package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3046SplitTheArrayTest {

	private final P3046SplitTheArray solution = new P3046SplitTheArray();

	@Test
	public void example1() {
		assertThat(solution.isPossibleToSplit(new int[]{1, 1, 2, 2, 3, 4})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isPossibleToSplit(new int[]{1, 1, 1, 1})).isFalse();
	}
}
