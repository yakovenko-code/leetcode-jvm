package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0303RangeSumQueryImmutableTest {

	@Test
	public void example1() {
		final P0303RangeSumQueryImmutable solution = new P0303RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});

		assertThat(solution.sumRange(0, 2)).isEqualTo(1);
		assertThat(solution.sumRange(2, 5)).isEqualTo(-1);
		assertThat(solution.sumRange(0, 5)).isEqualTo(-3);
	}
}
